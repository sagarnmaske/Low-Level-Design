package atmMachine;

public class ATMController {
    public void controlAtm() {
        try {
            ATM atm = new ATM(new ATMStateIdleState());
            atm.greeting();
            atm.acceptCard(new ATMCard("123", "Sagar", "", 133));
            atm.validatePin(124);
            atm.checkBalance();
            atm.withdrawCash();
            atm.collectCash();
        } catch (Exception e) {
            System.out.println("Error In the ATM");
        }
    }

}
