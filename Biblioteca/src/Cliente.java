package library;
public class Cliente {//Fiz algumas alterações

    private String Nome;
    private int Cpf;
    private int Matricula;
    private int NumLivrosComAluno;

    public Cliente() {
    }

    public Cliente(String Nome, int Cpf, int Matricula, int NumLivrosComAluno) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Matricula = Matricula;
        this.NumLivrosComAluno = NumLivrosComAluno;
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
    public void setCpf(int Cpf){//Modifiquei aqui, tava setNome, mas como ja tinha setNome acredito que o certo era desse jeito que coloquei
        this.Cpf = Cpf;
    }
    public int getMatricula(){
        return Matricula;
    }
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    public int getNumLivrosComAluno(){
        return NumLivrosComAluno;
    }
    public void setNumLivrosComAluno(int NumLivrosComAluno){
        this.NumLivrosComAluno = NumLivrosComAluno;
    }

}
