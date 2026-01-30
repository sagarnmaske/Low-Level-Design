package libraryManagamentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    Map<Book, Integer> bookStock;
    Map<Book, List<Reader>> outOfStockBooks;

    public Stock() {
        bookStock = new HashMap<>();
        outOfStockBooks = new HashMap<>();
    }

    public Stock(Map<Book, Integer> stock) {
        this.bookStock = stock;
    }

    public void addBook(Book book, int quantity) {
        this.bookStock.put(book, bookStock.getOrDefault(book, 0) + quantity);
        if (outOfStockBooks.containsKey(book)) {
            for (Reader reader : outOfStockBooks.get(book)) {
                reader.acceptNotification("Dear Reader:" + reader.readerName + " " + book.bookName + " Is available in Stock");
            }
            this.outOfStockBooks.remove(book);
        }
    }

    public void removeBook(Book book) {
        this.bookStock.put(book, bookStock.getOrDefault(book, 1) - 1);
        if (this.bookStock.get(book) == 0) {
            this.bookStock.remove(book);
            this.outOfStockBooks.put(book, new ArrayList<>());
        }
    }

    public boolean searchBook(Book book) {
        return this.bookStock.containsKey(book);
    }

    public void addReaderToOutOfStock(Reader reader, Book book) {
        this.outOfStockBooks.putIfAbsent(book, new ArrayList<>());
        this.outOfStockBooks.get(book).add(reader);
    }

}
