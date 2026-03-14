package paymentService;

public class NetBankingPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new NetBankingPaymentStrategy();
    }
}
