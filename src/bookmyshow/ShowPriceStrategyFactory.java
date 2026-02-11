package bookmyshow;

public class ShowPriceStrategyFactory {

    public static int getPrice(ShowType showType) {
        switch (showType) {
            case DRAMA -> {
                return 200;
            }
            case MOVIE -> {
                return 120;
            }
            default -> {
                return 100;
            }
        }
    }
}
