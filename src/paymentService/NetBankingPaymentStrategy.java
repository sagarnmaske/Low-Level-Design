package paymentService;

public class NetBankingPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid via netbanking");
    }
}
