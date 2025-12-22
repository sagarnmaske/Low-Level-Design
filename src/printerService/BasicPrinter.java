package printerService;

public class BasicPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("Printing Something By Basic Printer");
    }
}
