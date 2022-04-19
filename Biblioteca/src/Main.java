package library;
import library.Book;
//package Biblioteca;
//import java.Livro;


public class Main {
    public static void main (String[] args){
        Book livro1 = new Book("Percy Jackson", "Abacate", 42, true, "03-12-1942", 25.99);//"Fundamentos da Matematica", "Pedro Apolioso", 1999, false, "01-06-2022");
        Funcionario func1 = new Funcionario("Carlos", 123456789, 12321341);
        Cliente client1 = new Cliente("Jose", 13232, 2344, 1);
        Caixa caixa1 = new Caixa(livro1.Price(), 0.20);
        System.out.println("Livro: " + livro1.getName() + "\n" + "Autor do livro: " + livro1.getNameAuthor() + "  " + "Ano de lancamento: " + livro1.getReleaseYear() + "  " + "Emprestado: " + livro1.Borrowed() + "   " + "Data de devolução: " + livro1.DevolutionDate() + "  " + "Preço: " + livro1.Price() + "R$" + "\n");
        System.out.println("Funcionario: " + func1.getNome() + "\n" + "Carteira de Trabalho: " + func1.getCarteiraTrabalho() + "  " + "CPF: " + func1.getCpf() + "\n");
        System.out.println("Cliente: " + client1.getNome() + "\n" + "CPF: " + client1.getCpf() + "  " + "Matricula: " + client1.getMatricula() + "  " + "Numero de livros: " + client1.getNumLivrosComAluno());
        System.out.println("Caixa: 1" + "\n" + "Entrada: " + caixa1.getEntrada() + "  " + "Saida: "  + caixa1.setSaida());
        //Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());
    }
}
