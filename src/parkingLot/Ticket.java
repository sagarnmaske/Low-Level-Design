package parkingLot;

public class Ticket {
    int ticketId;
    Vehicle vehicle;
    String time;
    ParkingFloor parkingFloor;
    ParkingSpot parkingSpot;

    public Ticket(int ticketId, Vehicle vehicle, String time, ParkingFloor parkingFloor,
                  ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.time = time;
        this.parkingFloor = parkingFloor;
        this.parkingSpot = parkingSpot;
    }
}
