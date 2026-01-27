package atmMachine;

import javax.naming.OperationNotSupportedException;

public class ATMStateIdleState implements ATMState {

    @Override
    public void greeting() {
        System.out.println("Greet The User, Hello There!!");
    }

    @Override
    public void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotSupportedException {
        System.out.println(atmCard);
        System.out.println("Accepted");
        atm.setCurState(ATMStatesFactory.getATMState(ATMStates.HAS_CARD));
    }

}
