package atmMachine;

public class ATMStateIdleState implements ATMState {

    @Override
    public void greeting(ATM atm) {
        System.out.println(atm);
        System.out.println("Greet The User, Hello There!!");
    }

    @Override
    public void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotAllowed {
        System.out.println(atmCard);
        System.out.println("Accepted");
        atm.setCurState(new HasCardState(atmCard));
    }

}
