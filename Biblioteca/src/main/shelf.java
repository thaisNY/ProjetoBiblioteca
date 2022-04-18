package library;
import library.book;
import java.util.ArrayList;

public class shelf {
	ArrayList<book> Shelf = new ArrayList<book>();

	public void printShelf() {
		for (int i = 0; i < Shelf.size(); i++) {
			System.out.println(Shelf.get(i).get_name());
			//NOTE: without book method, it prints package.class@memory_address[?]
		}
	}

	public void add(book x) {
		Shelf.add(x);
	}

	public void remove(book y) {
		Shelf.remove(y);

	}

	public void search(book z) {
		Shelf.indexOf(z);
	}
}



