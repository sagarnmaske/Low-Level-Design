package vedingMachine;

public class HasMoneyState implements VendingState {

    @Override
    public void returnMoney(VendingMachine vendingMachine) {
        System.out.println("Has Money State Money Returned");
        System.out.println("Money Return");
        vendingMachine.setVendingState(new IdleState());
    }

    @Override
    public void chooseItem(VendingMachine vendingMachine) {
        System.out.println("Has Money State");
        System.out.println("Choose Item");
        vendingMachine.setVendingState(new DispensingState());
    }
}
