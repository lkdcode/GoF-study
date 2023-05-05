package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 명시적으로 Iterator 를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("book.getName() = " + book.getName());
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // 확장 for 문을 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println("book.getName() = " + book.getName());
        }
        System.out.println();

        List<Book> books = new ArrayList<>();
    }
}
