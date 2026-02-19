package atmMachine;

public interface ATMState {
    default void greeting() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void acceptCard(ATMCard atmCard, ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default boolean validDatePin(int pin, BankServer bankServer) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void checkBalance(BankServer bankServer) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void withdrawCash(ATM atm, BankServer bankServer, int amount) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void depositCash(int amount, BankServer bankServer) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    default void collectCash(ATM atm) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }
}
