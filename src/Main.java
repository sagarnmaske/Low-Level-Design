import printerService.AdvancePrinter;
import printerService.AllInOnePrinter;
import printerService.BasicPrinter;
import printerService.Office;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        PaymentManager paymentManager = new PaymentManager();
//        PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod("cash");
//        paymentStrategy.pay();
        Office office = new Office(new BasicPrinter());
        office.doWork();
    }
}