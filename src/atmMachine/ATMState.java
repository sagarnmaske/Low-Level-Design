package atmMachine;

public interface ATMState {
    default void greeting() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default boolean validDatePin(ATMCard atmCard, int pin, BankServer bankServer) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void checkBalance() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void withdrawCash(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void depositCash() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void collectCash(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }
}
