package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf; // 검색할 책장
    private int index; // 현재 보고 있는 책


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 다음 책이 있다면 true,
     * 없다면 false
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) return true;
        return false;
    }

    /**
     * 현재 주목하는 책(Book 인스턴스)을 반환하고,
     * 다시 '다음'으로 진행시킨다
     *
     * @return
     */
    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return bookShelf.getBookAt(index++);
    }

}
