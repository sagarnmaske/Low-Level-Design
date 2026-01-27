package atmMachine;

import javax.naming.OperationNotSupportedException;

public class HasCardState implements ATMState {

    @Override
    public boolean validDatePin(int pin) {
        System.out.println("Pin Validated");
        return true;
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance Is 10000");
    }

    @Override
    public void withdrawCash(ATM atm) throws OperationNotSupportedException {
        System.out.println("Cash Withdrawing");
        atm.setCurState(ATMStatesFactory.getATMState(ATMStates.MONEY_DESP));
    }

    @Override
    public void depositCash() {
        System.out.println("Service Not Available");
    }
}
