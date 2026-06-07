package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
