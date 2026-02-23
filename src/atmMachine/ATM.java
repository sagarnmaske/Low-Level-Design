package atmMachine;

public class ATM {
    ATMState curState;
    BankServer bankServer;
    InventoryManager inventoryManager;
    MoneyProcessingChain moneyProcessingChain;
    int atmId;
    String address;
    String bankName;

    public ATM(ATMState atmState, BankServer bankServer, InventoryManager inventoryManager,
               int atmId, String address, String bankName, MoneyProcessingChain moneyProcessingChain) {
        this.curState = atmState;
        this.bankServer = bankServer;
        this.inventoryManager = inventoryManager;
        this.atmId = atmId;
        this.address = address;
        this.bankName = bankName;
        this.moneyProcessingChain = moneyProcessingChain;
    }

    public void setCurState(ATMState atmState) {
        this.curState = atmState;
    }

    public void greeting() {
        this.curState.greeting(this);
    }

    public void acceptCard(ATMCard atmCard) {
        this.curState.acceptCard(atmCard, this);
    }

    public boolean validatePin(int pin) {
        return this.curState.validDatePin(pin, this);
    }

    public void checkBalance() {
        this.curState.checkBalance(this);
    }

    public Money withdrawCash(int amount) throws OperationNotAllowed {
        Money money = new Money();
        this.curState.withdrawCash(this, amount, money);
        return money;
    }

    public void collectCash() {
        this.curState.collectCash(this);
    }

    public void depositCash(int amount) {
        this.curState.depositCash(amount, this);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "address='" + address + '\'' +
                ", atmId=" + atmId +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
