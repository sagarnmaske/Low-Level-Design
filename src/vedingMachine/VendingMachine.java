package vedingMachine;

public class VendingMachine {
    Inventory inventory;
    VendingState vendingState;
    long balance;

    public VendingMachine(Inventory inventory, VendingState vendingState) {
        this.inventory = inventory;
        this.vendingState = vendingState;
        balance = 0;
    }

    public void setVendingState(VendingState vendingState) {
        this.vendingState = vendingState;
    }

    public void greet() {
        vendingState.greet();
    }

    public void acceptMoney() {
        vendingState.acceptMoney(this);
    }

    public void chooseItem() {
        vendingState.chooseItem(this);
    }

    public void returnMoney() {
        vendingState.returnMoney(this);
    }

    public void dispensingItem() {
        vendingState.dispensingItem(this);
    }
}
