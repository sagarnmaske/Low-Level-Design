package atmMachine;

import javax.naming.OperationNotSupportedException;

public interface ATMState {
    default void greeting() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void acceptCard(ATMCard atmCard,ATM atm) throws Exception {
        throw new OperationNotSupportedException();
    }

    default boolean validDatePin(int pin) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void checkBalance() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void withdrawCash(ATM atm) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void depositCash() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void collectCash(ATM atm) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
