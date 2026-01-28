package parkingLot;

import java.util.List;

public class InitializeParkingLot {

    public static ParkingLot initializeParkingLot() {
        ParkingSpot parkingSpot1 = new ParkingSpot(1);
        ParkingSpot parkingSpot2 = new ParkingSpot(2);
        ParkingSpot parkingSpot3 = new ParkingSpot(3);
        ParkingSpot parkingSpot4 = new ParkingSpot(4);
        ParkingSpot parkingSpot5 = new ParkingSpot(5);
        List<ParkingSpot> parkingSpots = List.of(parkingSpot1, parkingSpot2,
                parkingSpot3, parkingSpot4, parkingSpot5);
        ParkingFloor floor1 = new ParkingFloor(1, parkingSpots);
        ParkingFloor floor2 = new ParkingFloor(2, parkingSpots);
        ParkingFloor floor3 = new ParkingFloor(3, parkingSpots);
        return new ParkingLot(List.of(floor1, floor2, floor3));
    }
}
