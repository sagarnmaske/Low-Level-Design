package paymentService;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("paid via credit card");
    }
}
