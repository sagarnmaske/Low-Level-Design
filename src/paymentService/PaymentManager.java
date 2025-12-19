package paymentService;

public class PaymentManager {


    private PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();
    public PaymentStrategy choosePaymentMethod(String choice){
       return paymentStrategyFactory.getPaymentStrategy(choice);
    }
}
