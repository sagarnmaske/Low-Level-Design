package parkingLot;

import paymentService.PaymentManager;
import paymentService.PaymentStrategy;

public class ParkingLotManager {
    public void manageParking() {
        ParkingLot parkingLot = InitializeParkingLot.initializeParkingLot();
        Ticket ticket1 = ParkUnparkVehicle.parkVehicle(new Car("123"), parkingLot.parkingFloors.get(0),
                parkingLot.parkingFloors.get(0).parkingSpots.get(0));
        Ticket ticket2 = ParkUnparkVehicle.parkVehicle(new Bike("mh 13 389263"),
                parkingLot.parkingFloors.get(1), parkingLot.parkingFloors.get(1).parkingSpots.get(0));
        Bill bill1 = ParkUnparkVehicle.unParkVehicle(ticket1);
        Bill bill2 = ParkUnparkVehicle.unParkVehicle(ticket2);
        PaymentManager paymentManager = new PaymentManager();
        PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod("upi");
        paymentStrategy.pay(bill1.getAmount());
        paymentStrategy.pay(bill2.getAmount());
    }


}
