package paymentService;

public class UPIPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new UpiPaymentStrategy();
    }
}
