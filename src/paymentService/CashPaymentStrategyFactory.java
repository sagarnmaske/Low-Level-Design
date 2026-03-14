package paymentService;

public class CashPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CashPaymentStrategy();
    }

}
