
import atmMachine.ATMController;
import factoryPattern.CarFactoryController;
import parkingLot.ParkingLotManager;

public class Main {
    public static void main(String[] args) {
//        ATMController atmController = new ATMController();
//        atmController.controlAtm();
        CarFactoryController carFactoryController = new CarFactoryController();
        carFactoryController.testDrive();
    }
}