import atmMachine.ATMController;

import templateDesignPattern.PaymentInterface;

public class Main {
    public static void main(String[] args) {
        ATMController atmController = new ATMController();
        atmController.controlAtm();
    }
}