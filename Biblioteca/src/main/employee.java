package library;

public class employee {
    private String name;
    private int cpf;
    private int ctps;

    public employee() {
    }

    public employee(String name, int cpf, int ctps) {
        this.name = name;
        this.cpf = cpf;
        this.ctps = ctps;
    }

    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.name = name;
    }
    public int get_cpf(){
        return cpf;
    }
    public void set_name(int cpf){
        this.cpf = cpf;
    }
    public int getCtps(){
        return ctps;
    }
    public void setctps(int ctps){
        this.ctps = ctps;
    }
}
