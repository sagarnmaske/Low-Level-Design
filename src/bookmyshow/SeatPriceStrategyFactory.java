package bookmyshow;

public class SeatPriceStrategyFactory {
    public static int getSeatWisePrice(SeatType seatType) {
        switch (seatType) {
            case GOLD -> {
                return 150;
            }
            case PREMIUM -> {
                return 250;
            }

            case PLATINUM -> {
                return 200;
            }
            default -> {
                return 100;
            }
        }
    }
}
