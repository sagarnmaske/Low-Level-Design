package solid.openClosedPrinciple;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying by UPI");
    }
}
