package library;
import library.*;
//import java.util.ArrayList;

//package Biblioteca;
//import java.Livro;


public class main {
    public static void main(String[] args){

        book livro1 = new book("Percy Jackson", "Abacate", 42, true, "03-12-1942", 25.99);//"Fundamentos da Matematica", "Pedro Apolioso", 1999, false, "01-06-2022");
        employee func1 = new employee("Carlos", 123456789, 12321341);
        customer client1 = new customer("Jose", 13232, 2344, 1);
        cashier caixa1 = new cashier(livro1.Price(), 0.20);
        System.out.println("======================");
		System.out.println("Livro: " + livro1.get_name() + "\n" + "Autor do livro: " + livro1.get_nameAuthor() + "  " + "Ano de lancamento: " + livro1.getReleaseYear() + "  " + "Emprestado: " + livro1.Borrowed() + "   " + "Data de devolucao: " + livro1.DevolutionDate() + "  " + "Preco: " + livro1.Price() + "R$" + "\n");
        System.out.println("Funcionario: " + func1.get_name() + "\n" + "Carteira de Trabalho: " + func1.getCtps() + "  " + "CPF: " + func1.get_cpf() + "\n");
        System.out.println("Cliente: " + client1.get_name() + "\n" + "CPF: " + client1.get_cpf() + "  " + "Matricula: " + client1.get_registration() + "  " + "Numero de livros: " + client1.get_booksWithStudent());
        System.out.println("Caixa: 1" + "\n" + "Entrada: " + caixa1.getInput() + "  " + "Saida: "  + caixa1.setOutput());
        System.out.println("======================");

		//Collections with ArrayList
		//ArrayList<Book> Shelf = new ArrayList<Book>();
		//Shelf.add(livro1);

        shelf prat1 = new shelf();
		prat1.add(livro1);
		prat1.printShelf();

		//System.out.println(shelf); //print reference to objects in ArrayList
		//System.out.println(Shelf.indexOf()) //returns index (of the pointer to an object) in an ArrayList



		//Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());



        //Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());
    }
}
