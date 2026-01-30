package libraryManagamentSystem;

import java.util.Scanner;

public class SearchBookByBookName implements SearchBook {
    Stock stock;

    public SearchBookByBookName(Stock stock) {
        this.stock = stock;
    }

    @Override
    public boolean searchBook() {
        System.out.println("Searching Book by Name");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name");
        String bookName = sc.nextLine();
        for (Book book : stock.bookStock.keySet()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Book returnSearchedBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name");
        String bookName = sc.nextLine();
        for (Book book : stock.bookStock.keySet()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }
}
