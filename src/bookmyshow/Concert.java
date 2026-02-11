package bookmyshow;

import java.util.List;

public class Concert extends Show{
    public Concert(List<Seat> seats, ShowType showType, String time) {
        super(seats, showType, time);
    }
}
