package vedingMachine;

public class VendingMachineController {
    VendingMachine vendingMachine;

    public VendingMachineController(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void controlVendingMachine() {
        //Valid Operation in Idle State
        this.vendingMachine.greet();

        //Valid Operation in Idle State
        this.vendingMachine.acceptMoney();

        //Invalid operation in HasMoney State
        this.vendingMachine.acceptMoney();

        // Valid Operation In HasMoney State
        this.vendingMachine.chooseItem();

        //Valid Operation in Dispensing State
        this.vendingMachine.dispensingItem();

        // Valid Operation in After Dispensing State
        this.vendingMachine.returnMoney();

        //Invalid Operation in Idle State
        this.vendingMachine.returnMoney();
    }
}
