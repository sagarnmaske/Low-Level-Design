package parkingLot;

import java.util.List;

public class InitializeParkingLot {

    public static ParkingLot initializeParkingLot() {
        ParkingSpot parkingSpot1 = new BikeParkingSpot(1, ParkingSpotType.BIKE);
        ParkingSpot parkingSpot2 = new BikeParkingSpot(2, ParkingSpotType.BIKE);
        ParkingSpot parkingSpot3 = new CarParkingSpot(3, ParkingSpotType.CAR);
        ParkingSpot parkingSpot4 = new CarParkingSpot(4, ParkingSpotType.CAR);
        ParkingSpot parkingSpot5 = new CarParkingSpot(5, ParkingSpotType.CAR);
        List<ParkingSpot> parkingSpots = List.of(parkingSpot1, parkingSpot2,
                parkingSpot3, parkingSpot4, parkingSpot5);
        ParkingFloor floor0 = new ParkingFloor(1, parkingSpots);
        ParkingFloor floor1 = new ParkingFloor(2, parkingSpots);
        ParkingFloor floor2 = new ParkingFloor(3, parkingSpots);
        return new ParkingLot(List.of(floor0, floor1, floor2));
    }
}
