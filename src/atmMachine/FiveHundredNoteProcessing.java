package atmMachine;

public class FiveHundredNoteProcessing implements MoneyProcessingChain {
    InventoryManager inventoryManager;
    MoneyProcessingChain nextInChain;

    public FiveHundredNoteProcessing(InventoryManager inventoryManager, MoneyProcessingChain nextInChain) {
        this.inventoryManager = inventoryManager;
        this.nextInChain = nextInChain;
    }


    @Override
    public boolean withdrawMoney(Money money, int amount) {
        int count = amount / 500;
        if (nextInChain != null && nextInChain.withdrawMoney(money, amount - 500 * count)) {
            money.fiveHundredNotes = inventoryManager.removeFiveHundredNotes(count);
            return true;
        }
        return false;
    }

    @Override
    public void depositMoney(Money money) {
        inventoryManager.addFiveHundredNotes(money.fiveHundredNotes);
        if (nextInChain != null) {
            nextInChain.depositMoney(money);
        }

    }
}
