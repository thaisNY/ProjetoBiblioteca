package library;
import shelf.Book;
//package Biblioteca;
//import java.Livro;


public class Principal {
    public static void main(String[] args){
        Book livro1 = new Book("cenoura", "abacate", 42, true, "03-12-1932");//"Fundamentos da Matematica", "Pedro Apolioso", 1999, false, "01-06-2022");
        System.out.println(livro1.getName());
        //Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());
    }
}
