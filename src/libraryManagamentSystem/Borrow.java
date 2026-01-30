package libraryManagamentSystem;

public class Borrow {
    public int borrowId;
    public Book book;
    public Reader reader;
    public int borrowTime;

    public Borrow(int borrowId, Book book, Reader reader, int borrowTime) {
        this.borrowId = borrowId;
        this.book = book;
        this.reader = reader;
        this.borrowTime = borrowTime;
    }
}
