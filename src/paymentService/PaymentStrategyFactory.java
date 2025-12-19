package paymentService;

public class PaymentStrategyFactory {

    public PaymentStrategy getPaymentStrategy(String choice) {
        if (choice.equals("card")) {
            return new CreditCardPaymentStrategy();
        } else if (choice.equals("upi")) {
            return new UpiPaymentStrategy();
        } else if (choice.equals("cash")) {
            return new CashPaymentStrategy();
        } else {
            return new NetBankingPaymentStrategy();
        }
    }
}
