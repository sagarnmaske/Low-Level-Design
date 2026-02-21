package atmMachine;

public class TwoHundredNoteProcessing implements MoneyProcessingChain {
    InventoryManager inventoryManager;
    MoneyProcessingChain nextInChain;

    public TwoHundredNoteProcessing(InventoryManager inventoryManager, MoneyProcessingChain nextInChain) {
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
