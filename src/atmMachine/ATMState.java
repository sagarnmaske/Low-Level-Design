package atmMachine;

import javax.naming.OperationNotSupportedException;

public interface ATM {
    default void greeting() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default ATM acceptCard(ATMCard card) throws Exception {
        throw new OperationNotSupportedException();
    }

    default boolean validDatePin(int pin) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void checkBalance() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default ATM withdrawCash() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default void depositCash() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    default ATM collectCash() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
