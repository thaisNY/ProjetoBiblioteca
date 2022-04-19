package library;
public class Caixa {
    private double Entrada;
    private double Saida;

    public Caixa(){
    }

    public Caixa(double Entrada, double Saida) {
        this.Entrada = Entrada;
        this.Saida = Saida;

    }

    public double getEntrada(){return Entrada;}
    public double setSaida(){return Saida;}//Modifiquei aqui, provavelmente ta errado, so mudei para que o codigo rodasse.

}
