import atmMachine.ATMController;

import libraryManagamentSystem.LibraryManager;
import parkingLot.ParkingLotManager;
import templateDesignPattern.PaymentInterface;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.manageLibrary();
    }
}