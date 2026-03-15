package vedingMachine;

public class ReturnMoneyState implements VendingState {
    @Override
    public void returnMoney(VendingMachine vendingMachine) {
        System.out.println("Returning Money State");
        System.out.println("Returning Money");
        vendingMachine.setVendingState(new IdleState());
    }
}
