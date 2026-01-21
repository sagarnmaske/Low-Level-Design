package templateDesignPattern;

public class PaymentWithCreditCard extends Payment {
    @Override
    public void authoriseUser() {
        System.out.println("User Authorised for this card");
    }

    @Override
    public void checkEnoughBalance() {
        System.out.println("Having Sufficient balance To Pay via Credit Card");
    }

    @Override
    public void makePayment() {
        System.out.println("Made Payment via Credit Card");
    }
}
