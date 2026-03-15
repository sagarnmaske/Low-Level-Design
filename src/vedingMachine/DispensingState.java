package vedingMachine;

public class DispensingState implements VendingState {
    @Override
    public void dispensingItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing Item State");
        System.out.println("Dispensing item has been dispensed");
        vendingMachine.setVendingState(new ReturnMoneyState());
    }
}
