package atmMachine;

public class HasCardState implements ATMState {
    ATMCard atmCard;

    public HasCardState(ATMCard atmCard) {
        this.atmCard = atmCard;
    }

    @Override
    public boolean validDatePin(int pin, ATM atm) {
        ValidatePin validatePin = new ValidatePinImplementations(atm.bankServer);
        return validatePin.isValidPin(atmCard, pin);
    }

    @Override
    public void checkBalance(ATM atm) {
        System.out.println("Checking balance");
        System.out.println(atm.bankServer.getBalance(this.atmCard));
    }

    @Override
    public void withdrawCash(ATM atm, int amount, Money money) throws OperationNotAllowed {
        atm.bankServer.withdrawBalance(this.atmCard, amount);
        System.out.println("Money Withdrawn From Account");
        atm.moneyProcessingChain.withdrawMoney(money, amount);
        System.out.println(atm.bankServer.getBalance(this.atmCard));
        System.out.println("Please collect cash");
        atm.setCurState(new MoneyDespising(atmCard));
    }

    @Override
    public void depositCash(int amount, ATM atm) {
        System.out.println("Depositing Cash");
        atm.bankServer.addBalance(this.atmCard, amount);
        System.out.println("Money Deposited in Account");
        System.out.println(atm.bankServer.getBalance(this.atmCard));
    }
}
