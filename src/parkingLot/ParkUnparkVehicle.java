package parkingLot;

public class ParkUnparkVehicle {
    ParkingLot parkingLot;

    public ParkUnparkVehicle(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public static Ticket parkVehicle(Vehicle vehicle, ParkingFloor parkingFloor, ParkingSpot spot) {
        System.out.println();
        Ticket ticket = new Ticket(vehicle, "10", parkingFloor, spot);
        for (ParkingSpot parkingSpot : parkingFloor.parkingSpots) {
            if (parkingSpot == spot) {
                parkingSpot.isOccupied = true;
            }
        }
        return ticket;
    }

    public static Bill unParkVehicle(Ticket ticket) {
        PricingStrategy pricingStrategy = VehiclePricingStrategyFactory.getBikePricingStrategy(ticket.vehicle);
        int price = pricingStrategy.getPrice();
        return new Bill(ticket, price);
    }
}
