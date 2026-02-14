package parkingLot;

public class ParkUnparkVehicle {
    ParkingLot parkingLot;

    public ParkUnparkVehicle(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public static Ticket parkVehicle(Vehicle vehicle, int flooorId, ParkingSpot spot) {
        System.out.println("Creating Ticket For Vehicle Parking");
        spot.isOccupied = true;
        return new Ticket(vehicle, "10", flooorId, spot);
    }

    public static Bill unParkVehicle(Ticket ticket) {
        PricingStrategy pricingStrategy = VehiclePricingStrategyFactory.getBikePricingStrategy(ticket.vehicle);
        int price = pricingStrategy.getPrice();
        System.out.println("Generating Bill for Ticket For Vehicle Parking");
        return new Bill(ticket, price);
    }
}
