package paymentService;

public class PaymentManager {


    public PaymentStrategy choosePaymentMethod(String choice){
        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();
       return paymentStrategyFactory.getPaymentStrategy(choice);
    }
}
