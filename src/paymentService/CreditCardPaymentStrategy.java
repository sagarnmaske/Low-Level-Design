package paymentService;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(long amount) {
        System.out.println(amount + " paid via credit card");
    }
}
