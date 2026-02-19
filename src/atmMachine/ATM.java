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

    public boolean validatePin(int pin) {
        return this.curState.validDatePin(pin, this.bankServer);
    }

    public void checkBalance() {
        this.curState.checkBalance(this.bankServer);
    }

    public void withdrawCash(int amount) throws OperationNotAllowed {
        this.curState.withdrawCash(this, bankServer, amount);
    }

    public void collectCash() {
        this.curState.collectCash(this);
    }

    public void depositCash(int amount) {
        this.curState.depositCash(amount, bankServer);
    }
}
