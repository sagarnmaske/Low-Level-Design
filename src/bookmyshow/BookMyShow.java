package bookmyshow;

import java.util.List;

public class BookMyShow {
    CityController cityWiseShow;
    ShowController showsInCity;

    public BookMyShow(CityController cityWiseShow, ShowController showsInCity) {
        this.cityWiseShow = cityWiseShow;
        this.showsInCity = showsInCity;
    }

    public List<Show> getShowsInCities(City city) {
        return this.cityWiseShow.cityWiseShows.get(city);
    }

    public List<City> getCitiesInShow(Show show) {
        return showsInCity.showsInCities.get(show);
    }
}
