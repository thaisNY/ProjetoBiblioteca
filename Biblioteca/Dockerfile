FROM alpine:3.14
RUN mkdir /app
RUN groupadd -r janitor && useradd -r -s /bin/false -g janitor janitor
WORKDIR /app
COPY . /app
RUN chown -R janitor:janitor /app
USER janitor



