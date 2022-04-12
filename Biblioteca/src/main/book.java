package library;

public class book { // Class
    private String Name;
    private String NameAuthor;
    private int ReleaseYear;
    private boolean Borrowed;
    private String DevolutionDate;
    private double Price;


    public book(String Name, String NameAutor, int ReleaseYear, boolean Borrowed, String DevolutionDate, double Price){ // Method
        this.Name = Name;
        this.NameAuthor = NameAuthor;
        this.ReleaseYear = ReleaseYear;
        this.Borrowed = Borrowed;
        this.DevolutionDate = DevolutionDate;
        this.Price = Price;
    }

    public String get_name(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String get_nameAuthor(){
        return NameAuthor;
    }
    public void set_NameAuthor(String NameAuthor){
        this.NameAuthor = NameAuthor;
    }
    public int getReleaseYear(){
        return ReleaseYear;
    }
    public void setName(int ReleaseYear){
        this.ReleaseYear = ReleaseYear;
    }
    public boolean Borrowed(){
        return Borrowed;
    }
    public void setBorrowed(boolean Borrowed){
        this. Borrowed =  Borrowed;
    }
    public String DevolutionDate(){
        return DevolutionDate;
    }
    public void setDevolutionDate(String DevolutionDate){
        this.DevolutionDate = DevolutionDate;
    }

    public double Price(){
        return Price;
    }

    public void setPrice(double Price){
        this.Price = Price;

    }

}


