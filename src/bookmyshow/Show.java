package bookmyshow;

import paymentService.PaymentStrategy;
import paymentService.PaymentStrategyFactory;

import java.util.List;

public class Show {
    List<Seat> seats;
    ShowType showType;
    String time;
    String name;
    String description;

    public Show(List<Seat> seats, ShowType showType, String time, String name, String description) {
        this.seats = seats;
        this.showType = showType;
        this.time = time;
        this.name = name;
        this.description = description;
    }

    public Ticket bookSeat(Seat seat) {
        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();
        PaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy("upi");
        Ticket ticket = seat.createTicket();
        System.out.println(ticket);
        System.out.println(ticket.price + ": Amount to be paid");
        paymentStrategy.pay(ticket.price);
        return ticket;
    }

    @Override
    public String toString() {
        return "Show{" +
                "seats=" + seats +
                ", showType=" + showType +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
