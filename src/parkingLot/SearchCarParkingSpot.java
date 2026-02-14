package parkingLot;

public class SearchCarParkingSpot implements SearchParkingSpot {

    ParkingLot parkingLot;

    public SearchCarParkingSpot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingSpot searchParkingSpot(int floorId) {
        for (ParkingSpot parkingSpot : parkingLot.parkingFloors.get(floorId).parkingSpots) {
            if (parkingSpot.parkingSpotType == ParkingSpotType.CAR && !parkingSpot.isOccupied) {
                return parkingSpot;
            }
        }
        return null;
    }
}
