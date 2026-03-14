package paymentService;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(long amount) {
        System.out.println(amount + " paid via UPI");
    }
}
