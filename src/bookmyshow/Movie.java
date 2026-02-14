package bookmyshow;

import java.util.List;

public class Movie extends Show {
    public Movie(List<Seat> seats, ShowType showType, String time, String name, String description) {
        super(seats, showType, time, name, description);
    }
}
