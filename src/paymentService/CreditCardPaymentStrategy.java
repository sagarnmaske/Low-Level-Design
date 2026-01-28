package paymentService;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid via credit card");
    }
}
