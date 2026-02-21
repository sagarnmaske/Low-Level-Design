package atmMachine;

public interface ATMState {
    default void greeting(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default boolean validDatePin(int pin, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void checkBalance(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void withdrawCash(ATM atm, int amount) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void depositCash(int amount, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void collectCash(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }
}
