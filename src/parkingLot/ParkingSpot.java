package parkingLot;

public class ParkingSpot {
    int parkingSpotId;
    ParkingSpotType parkingSpotType;
    boolean isOccupied;

    public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.isOccupied = false;
    }

}
