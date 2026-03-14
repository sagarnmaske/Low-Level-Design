package parkingLot;

public class CarPricingStrategy implements PricingStrategy {
    @Override
    public long getPrice(long time) {
        long currentTime = System.currentTimeMillis();
        System.out.println("Unparking Time:" + currentTime);
        System.out.println("Parked Time:" + (currentTime - time));
        return (currentTime - time) * 150;
    }
}
