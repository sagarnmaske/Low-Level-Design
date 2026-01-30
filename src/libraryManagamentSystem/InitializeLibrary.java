package libraryManagamentSystem;

import java.util.List;

public class InitializeLibrary {

    public static Library initializeLibrary() {
        Stock stock = new Stock();
        Book book1 = new Book(123, "Wings Of Fire", "Apj Abdul kalam");
        Book book2 = new Book(124, "Godam", "Munshi Premchand");
        Book book3 = new Book(125, "James Bond", "James Bond");
        Book book4 = new Book(126, "Harry Potter", "James Potter");
        Book book5 = new Book(127, "Harry Potter", "James Potter");
        stock.addBook(book1, 10);
        stock.addBook(book2, 10);
        stock.addBook(book3, 10);
        stock.addBook(book4, 10);
        stock.addBook(book5, 10);
        Reader reader1 = new Reader(1, "Sagar");
        Reader reader2 = new Reader(2, "suhani");
        Reader reader3 = new Reader(3, "Arni");
        Reader reader4 = new Reader(4, "Ganesh");
        List<Reader> readers = List.of(reader1, reader2, reader3, reader4);
        return new Library(stock, readers, new BorrowReturn());
    }
}
