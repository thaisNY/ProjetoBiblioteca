package Biblioteca;
public class Caixa {
    private int Entrada;
    private int Saida;

    public Caixa(){
    }

    public Caixa(int Entrada, int Saida) {
        this.Entrada = Entrada;
        this.Saida = Saida;

    }

    public int getEntrada(){return Entrada;}
    public void setSaida(int Saida){
        this.Saida = Saida;
    }
}
