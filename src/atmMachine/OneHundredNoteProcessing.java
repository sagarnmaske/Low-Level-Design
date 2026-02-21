package atmMachine;

public class OneHundredNoteProcessing implements MoneyProcessingChain {
    InventoryManager inventoryManager;
    MoneyProcessingChain nextInChain;

    public OneHundredNoteProcessing(InventoryManager inventoryManager, MoneyProcessingChain nextInChain) {
        this.inventoryManager = inventoryManager;
        this.nextInChain = nextInChain;
    }


    @Override
    public boolean withdrawMoney(Money money, int amount) {
        int count = amount / 100;
        if (count * 100 == amount) {
            money.twoHundredNotes = inventoryManager.removeHundredNotes(count);
            return true;
        }

        return false;
    }

    @Override
    public void depositMoney(Money money) {
        inventoryManager.addHundredNotes(money.hundredNotes);
        if (nextInChain != null) {
            nextInChain.depositMoney(money);
        }
    }
}
