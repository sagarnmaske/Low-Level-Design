package atmMachine;

public class HasCardState implements ATMState {
    ATMCard atmCard;

    public HasCardState(ATMCard atmCard) {
        this.atmCard = atmCard;
    }

    @Override
    public boolean validDatePin(ATMCard card, int pin, BankServer bankServer) {
        ValidatePin validatePin = new ValidatePinImplementations(bankServer);
        return validatePin.isValidPin(card, pin);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance Is 10000");
    }

    @Override
    public void withdrawCash(ATM atm) throws OperationNotAllowed {
        System.out.println("Cash Withdrawing");
        atm.setCurState(new MoneyDespising(atmCard));
    }

    @Override
    public void depositCash() {
        System.out.println("Service Not Available");
    }
}
