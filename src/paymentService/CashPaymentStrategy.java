package paymentService;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid via Cash");
    }
}
