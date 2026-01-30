package libraryManagamentSystem;

import java.util.List;

public class Library {
    Stock stock;
    List<Reader> readers;
    BorrowReturn borrowReturn;

    public Library(Stock stock, List<Reader> readers, BorrowReturn borrowReturn) {
        this.stock = stock;
        this.readers = readers;
        this.borrowReturn = borrowReturn;
    }
}
