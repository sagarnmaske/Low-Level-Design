package paymentService;

public class NetBankingPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("paid via netbanking");
    }
}
