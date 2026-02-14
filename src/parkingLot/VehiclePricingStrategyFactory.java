package parkingLot;

public class VehiclePricingStrategyFactory {
    public static PricingStrategy getBikePricingStrategy(Vehicle vehicle) {
        if (vehicle instanceof Bike) {
            return new BikePricingStrategy();
        } else if (vehicle instanceof Car) {
            return new CarPricingStrategy();
        } else {
            return null;
        }
    }
}
