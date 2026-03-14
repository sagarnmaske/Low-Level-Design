package paymentService;

public class NetBankingPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(long amount) {
        System.out.println(amount + " paid via netbanking");
    }
}
