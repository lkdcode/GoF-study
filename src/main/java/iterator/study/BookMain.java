package iterator.study;

import java.util.Iterator;

public class BookMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("title1"));
        bookShelf.appendBook(new Book("title2"));
        bookShelf.appendBook(new Book("title3"));
        bookShelf.appendBook(new Book("title4"));
        bookShelf.appendBook(new Book("title5"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
