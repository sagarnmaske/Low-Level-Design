package atmMachine;

import javax.naming.OperationNotSupportedException;

public class MoneyDespesing implements ATMState {
    public void collectCash(ATM atm) throws OperationNotSupportedException {
        System.out.println("Cash Collected");
        atm.setCurState(ATMStatesFactory.getATMState(ATMStates.IDLE));
    }

}
