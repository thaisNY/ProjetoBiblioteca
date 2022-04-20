package library;
import library.*;
//import java.util.ArrayList;

//package Biblioteca;
//import java.Livro;


public class main {
    public static void main(String[] args){

        book livro1 = new book("Percy Jackson", "Riordao", 42, true, "04-05-2022", 25.99);
		book livro2 = new book("Jogo dos Tronos", "George Reorge Reorge Martin", 2008, false, "14-05-2022", 25.99);
		book livro3 = new book("Senhor dos Anéis", "Tolkiao", 1963, true, "26-04-2022", 25.99);

		employee func1 = new employee("Carlos", 123456789, 12321341);
        customer client1 = new customer("Jose", 13232, 2344, 1);
        cashier caixa1 = new cashier(livro1.Price(), 0.20);
        System.out.println("\n======================");
		System.out.println("Livro: " + livro1.getName() + "\n" + "Autor do livro: " + livro1.getNameAuthor() + "  " + "Ano de lancamento: " + livro1.getReleaseYear() + "  " + "Emprestado: " + livro1.isBookBorrowed() + "   " + "Data de devolucao: " + livro1.DevolutionDate() + "  " + "Preco: " + livro1.Price() + "R$" + "\n");
        System.out.println("Funcionario: " + func1.getEmployeeName() + "\n" + "Carteira de Trabalho: " + func1.getCtps() + "  " + "CPF: " + func1.getCpf() + "\n");
        System.out.println("Cliente: " + client1.getCustomerName() + "\n" + "CPF: " + client1.getCpf() + "  " + "Matricula: " + client1.getRegistration() + "  " + "Numero de livros: " + client1.getBorrowedByStudent());
        System.out.println("Caixa: 1" + "\n" + "Entrada: " + caixa1.getInput() + "  " + "Saida: "  + caixa1.setOutput());
        System.out.println("======================");

		//Collections with ArrayList
		//ArrayList<Book> Shelf = new ArrayList<Book>();
		//Shelf.add(livro1);

        shelf prat1 = new shelf();
        prat1.sizeOfShelf(); // TAMANHO ATUAL DA LISTA (0)
        prat1.add(livro1);
        prat1.sizeOfShelf(); // TAMANHO ATUAL DA LISTA (1)


        prat1.add(livro2);
		prat1.add(livro3);
        prat1.booksInShelf();
        prat1.remove(livro1);
		prat1.sizeOfShelf();
		prat1.booksInShelf();
        prat1.search(livro2);



        prat1.testBookMethod(livro2);




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
