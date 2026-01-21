package templateDesignPattern;

public class PaymentInterface {
    public void pay(){
        Payment upiPayment = new PaymentWithUPI();
        Payment creditCardPayment = new PaymentWithCreditCard();
        upiPayment.pay();
        creditCardPayment.pay();
    }
}
