package paymentService;

public class CreditCardPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CreditCardPaymentStrategy();
    }
}
