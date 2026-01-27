package atmMachine;

import javax.naming.OperationNotSupportedException;

public class ATMIdleState implements ATM {

    @Override
    public void greeting() {
        System.out.println("Greet The User, Hello There!!");
    }

    @Override
    public ATM acceptCard(ATMCard atmCard) throws OperationNotSupportedException {
        System.out.println(atmCard);
        System.out.println("Accepted");
        return ATMStatesFactory.getATMState(ATMStates.HAS_CARD);
    }

}
