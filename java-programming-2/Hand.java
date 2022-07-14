import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Hand {
    private List<Book> books;

    public Hand() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    // Use .iterator() to iterate all elements inside
    // iterator.hasNext() to get boolean if continue
    // iterator.next() to get next element in iterator
    public void print() {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
