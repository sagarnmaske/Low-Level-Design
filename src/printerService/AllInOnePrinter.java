package printerService;

public class AllInOnePrinter implements Printable,Faxable, Scannable {
    @Override
    public void fax() {
        System.out.println("Faxed by All In  One Printer");
    }

    @Override
    public void print() {
        System.out.println("Printed by All in One Printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanned by All in One Printer");
    }
}
