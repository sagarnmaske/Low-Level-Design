package paymentService;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid via UPI");
    }
}
