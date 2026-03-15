package vedingMachine;

public class IdleState implements VendingState {

    @Override
    public void greet() {
        System.out.println("Hello From Vending Machine");
    }

    @Override
    public void acceptMoney(VendingMachine vendingMachine) {
        System.out.println("I'm Idle");
        System.out.println("Money Accepted");
        vendingMachine.setVendingState(new HasMoneyState());
    }
}
