package atmMachine;

import javax.naming.OperationNotSupportedException;

public class ATM {
    ATMState curState;

    public ATM(ATMState atmState) {
        this.curState = atmState;
    }

    public void setCurState(ATMState atmState) {
        this.curState = atmState;
    }

    public void greeting() throws OperationNotSupportedException {
        this.curState.greeting();
    }

    public void acceptCard(ATMCard atmCard) throws Exception {
        this.curState.acceptCard(atmCard,this);
    }

    public void validatePin(int pin) throws OperationNotSupportedException {
        this.curState.validDatePin(pin);
    }

    public void checkBalance() throws OperationNotSupportedException {
        this.curState.checkBalance();
    }

    public void withdrawCash() throws OperationNotSupportedException {
        this.curState.withdrawCash(this);
    }

    public void collectCash() throws OperationNotSupportedException {
        this.curState.collectCash(this);
    }
}
