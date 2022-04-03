package library;
public class Funcionario {
    private String Nome;
    private int Cpf;
    private int CarteiraTrabalho;

    public Funcionario(String Nome, int Cpf, int CarteiraTrabalho) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.CarteiraTrabalho = CarteiraTrabalho;
    }

    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public int getCpf(){
        return Cpf;
    }
    public void setNome(int Cpf){
        this.Cpf = Cpf;
    }
    public int getCarteiraTrabalho(){
        return CarteiraTrabalho;
    }
    public void setCarteiraTrabalho(int CarteiraTrabalho){
        this.CarteiraTrabalho = CarteiraTrabalho;
    }
}
