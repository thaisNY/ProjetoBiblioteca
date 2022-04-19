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

    public String getEmployeeName(){
        return name;
    }
    public void set_name(String name){
        this.name = name;
    }
    public int getCpf(){
        return cpf;
    }
    public void setName(int cpf){
        this.cpf = cpf;
    }
    public int getCtps(){
        return ctps;
    }
    public void setCtps(int ctps){
        this.ctps = ctps;
    }
}
