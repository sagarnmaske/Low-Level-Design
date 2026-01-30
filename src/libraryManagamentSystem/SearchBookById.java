package libraryManagamentSystem;

import java.util.Scanner;

public class SearchBookById implements SearchBook {
    Stock stock;

    public SearchBookById(Stock stock) {
        this.stock = stock;
    }

    @Override
    public boolean searchBook() {
        System.out.println("Searching Book by ID");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID");
        int bookId = sc.nextInt();
        for (Book book : stock.bookStock.keySet()) {
            if (book.getBookId() == bookId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Book returnSearchedBook() {
        System.out.println("Searching Book by ID");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID");
        int bookId = sc.nextInt();
        for (Book book : stock.bookStock.keySet()) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
