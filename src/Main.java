import atmMachine.ATMController;

import parkingLot.ParkingLotManager;
import templateDesignPattern.PaymentInterface;

public class Main {
    public static void main(String[] args) {
        ParkingLotManager parkingLotManager = new ParkingLotManager();
        parkingLotManager.manageParking();
    }
}