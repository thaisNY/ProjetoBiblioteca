package library;
public class cashier {
    private int input;
    private int output;

    public cashier(){
    }

    public cashier(int input, int output) {
        this.input = input;
        this.output = output;

    }

    public int getinput(){return input;}
    public void setoutput(int output){
        this.output = output;
    }
}
