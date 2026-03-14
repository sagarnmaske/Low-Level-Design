package libraryManagamentSystem;

import paymentService.PaymentManager;
import paymentService.PaymentStrategy;

import java.util.ArrayList;

public class LibraryManager {

    public void manageLibrary() {
        Library library = InitializeLibrary.initializeLibrary();
        Stock stock = library.stock;
        BorrowReturn borrowReturn = library.borrowReturn;
        Reader reader = library.readers.get(0);
        Reader reader1 = library.readers.get(1);
        Reader reader2 = library.readers.get(2);
        SearchBook searchBookById = new SearchBookById(library.stock);
        Book outOfStockBook = new Book(222, "XYZ", "SAM");
        if (searchBookById.searchBook()) {
            borrowReturn.borrowBook(searchBookById.returnSearchedBook(), reader);
        } else {
            stock.outOfStockBooks.put(outOfStockBook, new ArrayList<>());
            stock.outOfStockBooks.get(outOfStockBook).add(reader1);
            stock.outOfStockBooks.get(outOfStockBook).add(reader2);
            stock.outOfStockBooks.get(outOfStockBook).add(reader);
        }
        stock.addBook(outOfStockBook, 5);
        SearchBook searchBookByName = new SearchBookByBookName(library.stock);
        if (searchBookByName.searchBook()) {
            borrowReturn.borrowBook(searchBookByName.returnSearchedBook(), reader);
            int amount = borrowReturn.returnBook(reader);
            System.out.println("Amount To Pay Is:" + amount + " Rupees");
            PaymentManager paymentManager = new PaymentManager();
            PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod();
            paymentStrategy.pay(amount);
        }

    }
}
