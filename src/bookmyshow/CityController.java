package bookmyshow;

import java.util.*;

public class CityController {

    Map<City, List<Show>> cityWiseShows;
    Map<City, List<Theatre>> cityWiseTheatre;

    public CityController() {
        cityWiseShows = new HashMap<>();
        cityWiseTheatre = new HashMap<>();
    }

    public void addCity(City city) {
        cityWiseShows.put(city, new ArrayList<>());
    }

    public void addShow(City city, Show show) {
        cityWiseShows.get(city).add(show);
    }

    public void addTheatre(City city, Theatre theatre) {
        cityWiseTheatre.get(city).add(theatre);
    }
}
