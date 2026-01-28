package parkingLot;

public class Bill {
    int billId;
    int amount;
    boolean isPaid;

    Bill(int billId, Ticket ticket) {
        this.billId = billId;
        String startTime = ticket.time;
        int sTime = Integer.parseInt(startTime);
        this.amount = (100 - sTime) * 100;
        this.isPaid = false;
    }

    public int getAmount() {
        return this.amount;
    }
}
