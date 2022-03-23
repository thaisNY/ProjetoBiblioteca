package Biblioteca;
import example.Livro;
//package Biblioteca;
//import java.Livro;


public class Principal {
    public static void main(String[] args){
        Livro livro1 = new Livro("cenoura", "abacate", 42, true, "03-12-1932");//"Fundamentos da Matematica", "Pedro Apolioso", 1999, false, "01-06-2022");
        System.out.println(livro1.getNome());
        //Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());
    }
}
