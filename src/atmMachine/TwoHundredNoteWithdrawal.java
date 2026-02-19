package atmMachine;

public class TwoHundredNoteWithdrawal implements MoneyWithdrawalChain {
    InventoryManager inventoryManager;
    MoneyWithdrawalChain nextInChain;

    public TwoHundredNoteWithdrawal(InventoryManager inventoryManager, MoneyWithdrawalChain nextInChain) {
        this.inventoryManager = inventoryManager;
        this.nextInChain = nextInChain;
    }


    @Override
    public boolean withdrawMoney(Money money, int amount) {
        int count = amount / 200;
        if (nextInChain != null && nextInChain.withdrawMoney(money, amount - 200 * count)) {
            money.twoHundredNotes = inventoryManager.removeTwoHundredNotes(count);
            return true;
        }
        return false;
    }

    @Override
    public void depositMoney(Money money) {
        inventoryManager.addTwoHundredNotes(money.twoHundredNotes);
        if (nextInChain != null) {
            nextInChain.depositMoney(money);
        }
    }
}
