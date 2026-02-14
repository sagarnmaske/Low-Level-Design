package parkingLot;

public class SearchBikeParkingSpot implements SearchParkingSpot {

    ParkingLot parkingLot;

    public SearchBikeParkingSpot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot searchParkingSpot(int floorId) {
        for (ParkingSpot parkingSpot : parkingLot.parkingFloors.get(floorId).parkingSpots) {
            if (parkingSpot.parkingSpotType == ParkingSpotType.BIKE && !parkingSpot.isOccupied) {
                return parkingSpot;
            }
        }
        return null;
    }
}
