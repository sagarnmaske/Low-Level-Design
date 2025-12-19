package paymentService;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("paid via UPI");
    }
}
