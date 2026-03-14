package paymentService;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(long amount) {
        System.out.println(amount + " Paid via Cash");
    }
}
