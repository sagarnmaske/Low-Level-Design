package atmMachine;

public class MoneyDespising implements ATMState {
    private ATMCard atmCard;

    public MoneyDespising(ATMCard atmCard) {
        this.atmCard = atmCard;
    }

    public void collectCash(ATM atm) {
        System.out.println("Cash Collected");
        atm.setCurState(new ATMStateIdleState());
    }

}
