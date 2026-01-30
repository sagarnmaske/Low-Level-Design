package libraryManagamentSystem;


import java.util.HashMap;
import java.util.Map;

public class BorrowReturn {

    Map<Reader, Borrow> borrows;

    public BorrowReturn() {
        borrows = new HashMap<>();
    }

    public void borrowBook(Book book, Reader reader) {
        System.out.println("Book Is Borrowed By:" + reader.readerName);
        Borrow borrow = new Borrow(123, book, reader, 2);
        borrows.put(reader, borrow);
    }

    public int returnBook(Reader reader) {
        System.out.println("Book Is Returned By:" + reader.readerName);
        Borrow borrow = borrows.get(reader);
        borrows.remove(reader);
        return (100 - borrow.borrowTime) * 100;
    }
}
