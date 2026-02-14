package parkingLot;

public class Bill {
    String billId;
    int amount;
    boolean isPaid;

    Bill(Ticket ticket, int amount) {
        this.billId = ticket.ticketId + amount + ticket.vehicle.vehicleNumber;
        this.amount = amount;
        this.isPaid = false;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", amount=" + amount +
                ", isPaid=" + isPaid +
                '}';
    }
}
