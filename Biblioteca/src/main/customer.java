package library;
public class customer {

    private String name;
    private int cpf;
    private int registration; //carteira de trabalho
    private int borrowedByStudent;

    public customer() {

    }

    public customer(String name, int cpf, int registration, int BorrowedByStudent) {
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.borrowedByStudent = borrowedByStudent;
    }
    public String getCustomerName(){
        return name;
    }
    public void setCustomerName(String name){
        this.name = name;
   }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getRegistration(){
        return registration;
    }
    public void setRegistration(int registration){
        this.registration = registration;
    }

    //Borrowed books with students
    public int getBorrowedByStudent(){
        return borrowedByStudent;
    }
    public void setBorrowedByStudent(int borrowedByStudent){
        this.borrowedByStudent = borrowedByStudent;
    }

}
