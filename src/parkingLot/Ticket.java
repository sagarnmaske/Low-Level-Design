package parkingLot;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    String time;
    ParkingFloor parkingFloor;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, String time, ParkingFloor parkingFloor,
                  ParkingSpot parkingSpot) {
        this.ticketId = vehicle.vehicleNumber + time;
        this.vehicle = vehicle;
        this.time = time;
        this.parkingFloor = parkingFloor;
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
