package atmMachine;

public class ATMController {
    public void controlAtm() {
        try {
            BankServer bankServer = BankServerInitializer.initializeServer();
            ATM atm = new ATM(new ATMStateIdleState(), bankServer);
            atm.greeting();
            ATMCard atmCard = new ATMCard("125633", "Sagar", "12/26", 128);
            atm.acceptCard(atmCard);
            System.out.println(atm.validatePin(atmCard, 1234, bankServer));
            atm.checkBalance();
            atm.withdrawCash();
            atm.collectCash();
        } catch (Exception e) {
            System.out.println("Error In the ATM");
        }
    }

}
