package atmMachine;

public class ATM {
    ATMState curState;
    BankServer bankServer;

    public ATM(ATMState atmState, BankServer bankServer) {
        this.curState = atmState;
        this.bankServer = bankServer;
    }

    public void setCurState(ATMState atmState) {
        this.curState = atmState;
    }

    public void greeting() {
        this.curState.greeting();
    }

    public void acceptCard(ATMCard atmCard) {
        this.curState.acceptCard(atmCard, this);
    }

    public boolean validatePin(ATMCard atmCard, int pin, BankServer bankServer) {
        return this.curState.validDatePin(atmCard, pin, bankServer);
    }

    public void checkBalance() {
        this.curState.checkBalance();
    }

    public void withdrawCash() {
        this.curState.withdrawCash(this);
    }

    public void collectCash() {
        this.curState.collectCash(this);
    }
}
