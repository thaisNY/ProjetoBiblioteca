package Biblioteca;
public class Livro {
    private String Nome;
    private String NomeAutor;
    private int AnoLancamento;
    private boolean Emprestado;
    private String DataDevolucao;


    public Livro(){
    }

    public Livro(String Nome, String NomeAutor, int AnoLancamento, boolean Emprestado, String DataDevolucao){
        this.Nome = Nome;
        this.NomeAutor = NomeAutor;
        this.AnoLancamento = AnoLancamento;
        this.Emprestado = Emprestado;
        this.DataDevolucao = DataDevolucao;
    }

    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getNomeAutor(){
        return NomeAutor;
    }
    public void setNomeAutor(String NomeAutor){
        this.NomeAutor = NomeAutor;
    }
    public int getAnoLancamento(){
        return AnoLancamento;
    }
    public void setNome(int AnoLancamento){
        this.AnoLancamento = AnoLancamento;
    }
    public boolean Emprestado(){
        return Emprestado;
    }
    public void setEmprestado(boolean Emprestado){
        this. Emprestado =  Emprestado;
    }
    public String DataDevolucao(){
        return DataDevolucao;
    }
    public void setDataDevolucao(String DataDevolucao){
        this.DataDevolucao = DataDevolucao;
    }

}


