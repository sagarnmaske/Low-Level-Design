package bookmyshow;

import java.util.*;

public class ShowController {

    Map<Show, List<City>> showsInCities;

    public ShowController() {
        showsInCities = new HashMap<>();
    }

    public void addShow(Show show) {
        showsInCities.put(show, new ArrayList<>());
    }

    public void addCity(Show show, City city) {
        showsInCities.get(show).add(city);
    }
}
