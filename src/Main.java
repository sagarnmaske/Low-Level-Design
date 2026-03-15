
import parkingLot.ParkingLotManager;
import vedingMachine.*;

public class Main {
    public static void main(String[] args) {
//        ParkingLotManager parkingLotManager = new ParkingLotManager();
//        parkingLotManager.manageParking();
        VendingMachineController vendingMachineController =
                new VendingMachineController(new VendingMachine
                        (new Inventory(new Column[]{}), new IdleState()));
        vendingMachineController.controlVendingMachine();
    }
}