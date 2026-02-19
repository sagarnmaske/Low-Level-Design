package atmMachine;

public class HasCardState implements ATMState {
    ATMCard atmCard;

    public HasCardState(ATMCard atmCard) {
        this.atmCard = atmCard;
    }

    @Override
    public boolean validDatePin(int pin, BankServer bankServer) {
        ValidatePin validatePin = new ValidatePinImplementations(bankServer);
        return validatePin.isValidPin(atmCard, pin);
    }

    @Override
    public void checkBalance(BankServer bankServer) {
        System.out.println("Checking balance");
        System.out.println(bankServer.getBalance(this.atmCard));
    }

    @Override
    public void withdrawCash(ATM atm, BankServer bankServer, int amount) throws OperationNotAllowed {
        bankServer.withdrawBalance(this.atmCard, amount);
        System.out.println("Money Withdrawn From Account");
        System.out.println(bankServer.getBalance(this.atmCard));
        System.out.println("Please collect cash");
        atm.setCurState(new MoneyDespising(atmCard));
    }

    @Override
    public void depositCash(int amount, BankServer bankServer) {
        System.out.println("Depositing Cash");
        bankServer.addBalance(this.atmCard, amount);
        System.out.println("Money Deposited in Account");
        System.out.println(bankServer.getBalance(this.atmCard));
    }
}
