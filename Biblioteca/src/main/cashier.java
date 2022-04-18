package library;
public class cashier {
    private double input;
    private double output;
    private int ID;

    public cashier(){
    }

    public cashier(double input, double output) {
        this.input = input;
        this.output = output;

    }

    public double getInput(){
        return input;
    }
    public double setOutput(){
         return output;
    }
}
