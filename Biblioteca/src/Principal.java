package Biblioteca;

public class Principal {
    public static void main(String[] args){
        Livro livro1 = new Livro("Fundamentos da Matemática", "Pedro Apolioso", 1999, false, "01/06/2022");
        System.out.println(livro1.getNome());
        //Livro livro1 = new Livro();
        //livro1.setNome("Fundamentos de Banco de Dados");
        // System.out.println(livro1.getNome());
    }
}
