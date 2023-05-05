package iterator.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> bookList;

    public BookShelf() {
        this.bookList = new ArrayList<>();
    }

    public int getSize() {
        return bookList.size();
    }

    public Book getBookAt(int index) {
        return bookList.get(index);
    }

    public void appendBook(Book book) {
        bookList.add(book);
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
