package paymentService;

public class PaymentManager {
    public PaymentStrategy choosePaymentMethod(){
        PaymentStrategyFactory paymentStrategyFactory = new UPIPaymentStrategyFactory();
        return paymentStrategyFactory.createPaymentStrategy();
    }
}
