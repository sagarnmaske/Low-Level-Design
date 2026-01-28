package parkingLot;

import java.util.List;

public class ParkingFloor {
    int parkingFloorNumber;
    List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floor, List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
        this.parkingFloorNumber = floor;
    }
}
