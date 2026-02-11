package bookmyshow;

public class Seat {
    int id;
    SeatType seatType;
    ShowType showType;
    boolean isOccupied;

    public Seat(int id, SeatType seatType, boolean isOccupied, ShowType showType) {
        this.id = id;
        this.seatType = seatType;
        this.isOccupied = isOccupied;
        this.showType = showType;
    }

    public Ticket createTicket() {
        int price = SeatPriceStrategyFactory.getSeatWisePrice(seatType) + ShowPriceStrategyFactory.getPrice(showType);
        return new Ticket(1, this, price);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatType=" + seatType +
                ", showType=" + showType +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
