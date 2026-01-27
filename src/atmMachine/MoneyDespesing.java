package atmMachine;

import javax.naming.OperationNotSupportedException;

public class MoneyDespencingState implements ATMState {
    public ATMState collectCash() throws OperationNotSupportedException {
        System.out.println("Cash Collected");
        return ATMStatesFactory.getATMState(ATMStates.IDLE);
    }

}
