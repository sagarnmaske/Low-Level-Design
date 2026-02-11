package bookmyshow;

import java.util.*;

public class CityController {

    Map<City, List<Show>> cityWiseShows;

    public CityController() {
        cityWiseShows = new HashMap<>();
    }

    public void addCity(City city) {
        cityWiseShows.put(city, new ArrayList<>());
    }

    public void addShow(City city, Show show) {
        cityWiseShows.get(city).add(show);
    }
}
