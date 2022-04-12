# alpine build
FROM alpine:3.14
RUN mkdir /app
RUN groupadd -r janitor && useradd -r -s /bin/false -g janitor janitor
WORKDIR /app
COPY . /app
RUN chown -R janitor:janitor /app
USER janitor

# build stage [mvn]
FROM maven:3-ibmjava-8@sha256:72da2bb98483a7f9610ad57914e8ba6a7b62753cdd0100acc86e543bf5d88056
COPY ./src /home/app/src
COPY ./pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM maven:3-ibmjava-8@sha256:72da2bb98483a7f9610ad57914e8ba6a7b62753cdd0100acc86e543bf5d88056

FROM maven
COPY ./target/java-application.jar /app/java-application.jar
RUN mvn clean install
CMD "java" "-jar" "java-application.jar"

FROM maven:3-ibmjava-8@sha256:72da2bb98483a7f9610ad57914e8ba6a7b62753cdd0100acc86e543bf5d88056




RUN mkdir /app
RUN groupadd -r janitor && useradd -r -s /bin/false -g janitor janitor
WORKDIR /app
RUN chown -R janitor:janitor /app
USER janitor
CMD "java" "-jar" "java-application.jar"

#Copy that to a file named Dockerfile, then build and run it.

# package stage []
FROM maven:3.8.5-openjdk-8-slim@sha256:119fe636911b9d31e84c580a195232e884169db39be1d853e763e54a71bf8881
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN mvn clean package -DskipTests

FROM
RUN mdkir /app
RUN addgroup --system javanitor && adduser -S -s /bin/false -G javanitor javanitor
COPY --from=build /project/target/java-application.jar /app/java-application.jar
WORKDIR /app
RUN chown -R javanitor:javanitor /app
USER javanitor
CMD "java" "-jar" "java-application.jar"



