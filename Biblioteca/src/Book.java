package library;

public class Book { // Class
    private String Name;
    private String NameAuthor;
    private int ReleaseYear;
    private boolean Borrowed;
    private String DevolutionDate;


    public Book(String Name, String NameAutor, int ReleaseYear, boolean Borrowed, String DevolutionDate){ // Method
        this.Name = Name;
        this.NameAuthor = NameAuthor;
        this.ReleaseYear = ReleaseYear;
        this.Borrowed = Borrowed;
        this.DevolutionDate = DevolutionDate;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getNameAuthor(){
        return NameAuthor;
    }
    public void setNameAuthor(String NameAuthor){
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

}


