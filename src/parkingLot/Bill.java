package parkingLot;

public class Bill {
    String billId;
    long amount;
    boolean isPaid;

    Bill(Ticket ticket, long amount) {
        this.billId = ticket.ticketId + amount + ticket.vehicle.vehicleNumber;
        this.amount = amount;
        this.isPaid = false;
    }

    public long getAmount() {
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
