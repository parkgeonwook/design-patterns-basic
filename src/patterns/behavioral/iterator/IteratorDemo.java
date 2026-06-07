package patterns.behavioral.iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("자바"));
        bookShelf.addBook(new Book("스프링"));
        bookShelf.addBook(new Book("디자인 패턴"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }

    }
}
