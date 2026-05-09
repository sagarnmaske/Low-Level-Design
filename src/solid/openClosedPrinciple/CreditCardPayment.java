package solid.openClosedPrinciple;

public class CreditCardPayment implements  Payment {
    @Override
    public void pay() {
        System.out.println("Paying by CreditCard");
    }
}
