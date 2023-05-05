package iterator.study;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getSize()) return true;
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return bookShelf.getBookAt(index++);
    }
}
