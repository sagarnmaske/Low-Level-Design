package paymentService;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paid via Cash");
    }
}
