package library;
import library.book;
import java.util.ArrayList;
import java.util.Scanner;

public class shelf {
	ArrayList<book> Shelf = new ArrayList<book>();

	public void sizeOfShelf() {
        if (Shelf.size() == 0) {
            System.out.println("|> Shelf is empty\n");
        } else {
            System.out.println("|> Books in shelf: " + Integer.toString(Shelf.size()) + "\n");
            //MessageFormat.format("|> Books in shelf: {0}", Shelf.size());
        }
    }

    public void booksInShelf() {
        System.out.println("Current books in shelf:\n");
		for (int i = 0; i < Shelf.size(); i++) {
			System.out.println("|==> " + Shelf.get(i).getName());
			//NOTE: without book method, it prints package.class@memory_address[?]
            }
		System.out.println("\n");
	}

	public void add(book x) {
		Shelf.add(x);
	}

	public void remove(book y) {
        if (Shelf.size() == 0) {
            System.out.println("\n|> Shelf is empty, cannot remove" + "\n");
        } else {
            int foo = Shelf.indexOf(y);
            System.out.println("\n|> index " + Integer.toString(foo) + " will be removed from Shelf O.o" + "\n");

            Shelf.remove(y);
        }

	}

	public void search(book z) {
		int bar = Shelf.indexOf(z);

        System.out.println("Book [" + Shelf.get(bar).getName() + "]" + " found at index " + Integer.toString(bar) + " in Shelf.");
		//Shelf.indexOf(z);
	}

    public void testBookMethod(book w) {
        //Shelf.get(Integer.toString(Shelf.indexOf(w)).getNameAuthor());
    }
}



