package atmMachine;

import javax.naming.OperationNotSupportedException;

public interface ATMState {
    default void greeting(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default boolean validDatePin(int pin, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default void checkBalance(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default void withdrawCash(ATM atm, int amount, Money money) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default void depositCash(int amount, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }

    default void collectCash(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed(new OperationNotSupportedException());
    }
}
