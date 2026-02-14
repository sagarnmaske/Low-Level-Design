package bookmyshow;

import java.util.List;

public class Drama extends Show {
    public Drama(List<Seat> seats, ShowType showType, String time, String name, String description) {
        super(seats, showType, time, name, description);
    }
}
