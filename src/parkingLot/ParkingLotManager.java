package parkingLot;

import paymentService.PaymentManager;
import paymentService.PaymentStrategy;

import java.util.Scanner;

public class ParkingLotManager {
    public void manageParking() {
        ParkingLot parkingLot = InitializeParkingLot.initializeParkingLot();
        SearchParkingSpot searchSpotForCar = new SearchCarParkingSpot(parkingLot);
        SearchParkingSpot searchParkingSpotForBike = new SearchBikeParkingSpot(parkingLot);
        while (true) {
            System.out.println("Enter Your Vehicle Details");
            System.out.println("What is Your Vehicle Type 1:CAR,2:BIKE");
            Scanner input = new Scanner(System.in);
            int vehicleType = input.nextInt();
            System.out.println("Enter the floor ID Where you want to Park Vehicle");
            int floorId = input.nextInt();
            System.out.println("Searching Parking Spot for your Vehicle Spot for ");
            Vehicle vehicle;
            ParkingSpot parkingSpot;
            if (vehicleType == 1) {
                vehicle = new Car("mh 1 12743");
                parkingSpot = searchSpotForCar.searchParkingSpot(floorId);
            } else {
                vehicle = new Bike("mh 12 12873");
                parkingSpot = searchParkingSpotForBike.searchParkingSpot(floorId);
            }
            if (parkingSpot == null) {
                System.out.println("No Parking Spot Present");
                break;
            }
            Ticket ticket = ParkUnparkVehicle.parkVehicle(vehicle, floorId, parkingSpot);
            System.out.println("Ticket Generated Successfully");
            System.out.println(ticket);
            System.out.println("Unpark your Vehicle");
            Bill bill = ParkUnparkVehicle.unParkVehicle(ticket);
            System.out.println("Bill Generated Successfully");
            System.out.println(bill);
            PaymentManager paymentManager = new PaymentManager();
            PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod("upi");
            paymentStrategy.pay(bill.getAmount());
            bill.isPaid = true;
            System.out.println(bill);
            System.out.println("To Park More Vehicle Press 1 Otherwise any Other");
            int choice = input.nextInt();
            if (choice != 1) {
                break;
            }
        }
    }


}
