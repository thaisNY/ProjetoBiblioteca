package library;
public class customer {

    private String name;
    private int cpf;
    private int registration;
    private int booksWithStudent;

    public Customer() {
    }

    public Customer(String name, int cpf, int registration, int booksWithStudent) {
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.booksWithStudent = booksWithStudent;
    }
    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.name = name;
   }
    public int get_Cpf(){
        return cpf;
    }
    public void set_name(int cpf){
        this.cpf = cpf;
    }
    public int get_Registration(){
        return registration;
    }
    public void set_Registration(int registration){
        this.registration = registration;
    }
    public int get_booksWithStudent(){
        return booksWithStudent;
    }
    public void set_booksWithStudent(int booksWithStudent){
        this.booksWithStudent = booksWithStudent;
    }

}
