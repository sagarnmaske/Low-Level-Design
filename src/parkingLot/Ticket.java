package parkingLot;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    String time;
    int parkingFloorId;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, String time, int parkingFloorId,
                  ParkingSpot parkingSpot) {
        this.ticketId = vehicle.vehicleNumber + time;
        this.vehicle = vehicle;
        this.time = time;
        this.parkingFloorId = parkingFloorId;
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", vehicle=" + vehicle +
                ", time='" + time + '\'' +
                '}';
    }
}
