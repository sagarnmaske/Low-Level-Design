package templateDesignPattern;

public class PaymentWithUPI extends Payment {
    @Override
    public void authoriseUser() {
        System.out.println("Request Authorised Valid Pay Request With UPI");
    }

    @Override
    public void checkEnoughBalance() {
        System.out.println("Have Enough Account Balance In UPI");
    }

    @Override
    public void makePayment() {
        System.out.println("Made Payment to the User Via UPI");
    }
}
