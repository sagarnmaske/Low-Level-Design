package libraryManagamentSystem;

public final class Book {
    int bookId;
    String bookName;
    String bookAuthor;

    public Book(int bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String toString() {
        return bookId + "\t" + bookName + "\t" + bookAuthor;
    }
}
