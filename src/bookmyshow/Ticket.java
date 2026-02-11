package bookmyshow;

public class Ticket {
    public int id;
    public int price;
    public Seat seat;

    public Ticket(int id, Seat seat, int price) {
        this.id = id;
        this.price = price;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
