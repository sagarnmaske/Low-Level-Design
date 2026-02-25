package factoryPattern;

public class CarFactoryController {
    public void testDrive() {
        CarFactory economyCarFactory = new EconomicalCarFactory();
        Car car1 = economyCarFactory.createCar();
        car1.drivingExperience();
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        Car car2 = luxuryCarFactory.createCar();
        car2.drivingExperience();
        CarFactory sportsCarFactory = new SportsCarFactory();
        Car car3 = sportsCarFactory.createCar();
        car3.drivingExperience();
    }
}
