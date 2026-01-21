
import commandDesignPattern.TvRemote;
import templateDesignPattern.PaymentInterface;

public class Main {
    public static void main(String[] args) {
        PaymentInterface paymentInterface = new PaymentInterface();
        paymentInterface.pay();
    }
}