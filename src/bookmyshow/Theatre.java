package bookmyshow;

import java.util.List;

public class Theatre {
    String name;
    String address;
    List<Show> shows;

    public Theatre(String name, List<Show> shows, String address) {
        this.name = name;
        this.shows = shows;
        this.address = address;
    }


}
