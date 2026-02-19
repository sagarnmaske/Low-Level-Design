package atmMachine;

import java.util.List;

public class InventoryInitializer {

    public static InventoryManager initializeInventoryManager() {
        Inventory inventory = new Inventory();
        InventoryManager inventoryManager = new InventoryManager(inventory);
        Note hundred1 = new OneHundredNote();
        Note hundred2 = new OneHundredNote();
        Note hundred3 = new OneHundredNote();
        Note hundred4 = new OneHundredNote();
        Note hundred5 = new OneHundredNote();

        Note twoHundredNote1 = new TwoHundredNote();
        Note twoHundredNote2 = new TwoHundredNote();
        Note twoHundredNote3 = new TwoHundredNote();
        Note twoHundredNote4 = new TwoHundredNote();
        Note twoHundredNote5 = new TwoHundredNote();
        Note twoHundredNote6 = new TwoHundredNote();

        Note fiveHundredNote1 = new FiveHundredNote();
        Note fiveHundredNote2 = new FiveHundredNote();
        Note fiveHundredNote3 = new FiveHundredNote();
        Note fiveHundredNote4 = new FiveHundredNote();
        Note fiveHundredNote5 = new FiveHundredNote();
        Note fiveHundredNote6 = new FiveHundredNote();
        inventoryManager.addHundredNotes(List.of(hundred1, hundred2, hundred3, hundred4, hundred5));
        inventoryManager.addTwoHundredNotes(List.of(twoHundredNote1, twoHundredNote2, twoHundredNote3,
                twoHundredNote4, twoHundredNote5, twoHundredNote6));
        inventoryManager.addFiveHundredNotes(List.of(fiveHundredNote1, fiveHundredNote2, fiveHundredNote3,
                fiveHundredNote4, fiveHundredNote5, fiveHundredNote6));

        System.out.println("Initially Total Money Available:" +
                inventoryManager.getTotalMoney());
        System.out.println("Total Notes are as follows");
        System.out.println(inventoryManager.totalAvailableNotes());

        return inventoryManager;
    }
}
