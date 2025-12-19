import paymentService.PaymentManager;
import paymentService.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PaymentManager paymentManager = new PaymentManager();
        PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod("cash");
        paymentStrategy.pay();
    }
}