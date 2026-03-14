package parkingLot;

public class ParkUnparkVehicle {
    ParkingLot parkingLot;

    public ParkUnparkVehicle(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public static Ticket parkVehicle(Vehicle vehicle, int floorId, ParkingSpot spot) {
        System.out.println("Creating Ticket For Vehicle Parking");
        spot.isOccupied = true;
        long currentTime = System.currentTimeMillis();
        System.out.println("Parking Time:" + currentTime);
        return new Ticket(vehicle, currentTime, floorId, spot);
    }

    public static Bill unParkVehicle(Ticket ticket) {
        PricingStrategy pricingStrategy = VehiclePricingStrategyFactory.getBikePricingStrategy(ticket.vehicle);
        long price = pricingStrategy.getPrice(ticket.time);
        System.out.println("Generating Bill for Ticket For Vehicle Parking");
        return new Bill(ticket, price);
    }
}
