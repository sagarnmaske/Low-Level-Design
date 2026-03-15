package vedingMachine;

public interface VendingState {

    default void greet() {
        System.out.println("Can't Greet in this State");
    }

    default void acceptMoney(VendingMachine vendingMachine) {
        System.out.println("Money Can't be accepted in this state");
    }

    default void chooseItem(VendingMachine vendingMachine) {
        System.out.println("Item can't be choose in this state");
    }

    default void returnMoney(VendingMachine vendingMachine) {
        System.out.println("Money Can't be returned in this state");
    }

    default void dispensingItem(VendingMachine vendingMachine) {
        System.out.println("Item Can't be dispensed in this state");
    }
}
