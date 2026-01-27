package atmMachine;

import javax.naming.OperationNotSupportedException;

public interface ATMStatesFactory {
    public static ATMState getATMState(ATMStates atmStates) throws OperationNotSupportedException {
        switch (atmStates){
            case IDLE -> {
                return new ATMStateIdleState();
            }
            case HAS_CARD -> {
                return new HasCardState();
            }
            case MONEY_DESP -> {
                return new MoneyDespesing();
            }
            default -> {
                throw new OperationNotSupportedException("Invalid State");
            }
        }
    }

}
