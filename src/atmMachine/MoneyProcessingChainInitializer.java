package atmMachine;

public class MoneyProcessingChainInitializer {

    public static MoneyProcessingChain initialize(InventoryManager inventoryManager) {
        MoneyProcessingChain oneHundredProcessor = new OneHundredNoteProcessing(inventoryManager, null);
        MoneyProcessingChain twoHundredProcessor = new TwoHundredNoteProcessing(inventoryManager, oneHundredProcessor);
        MoneyProcessingChain fiveHundredProcesser = new FiveHundredNoteProcessing(inventoryManager, twoHundredProcessor);
        return fiveHundredProcesser;
    }
}
