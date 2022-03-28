package library;
public class employee {
    private String name;
    private int cpf;
    private int CarteiraTrabalho;

    public employee() {
    }

    public employee(String name, int cpf, int CarteiraTrabalho) {
        this.name = name;
        this.cpf = cpf;
        this.CarteiraTrabalho = CarteiraTrabalho;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCpf(){
        return cpf;
    }
    public void setname(int cpf){
        this.cpf = cpf;
    }
    public int getCarteiraTrabalho(){
        return CarteiraTrabalho;
    }
    public void setCarteiraTrabalho(int CarteiraTrabalho){
        this.CarteiraTrabalho = CarteiraTrabalho;
    }
}
