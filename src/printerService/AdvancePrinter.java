package printerService;

public class AdvancePrinter  implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing By Advance Printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning by Advance Printer");
    }
}
