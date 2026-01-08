package factoryPattern;

public class CarFactoryController {
    public void testDrive() {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getCar(CarType.FAST);
        car1.drivingExperience();
        Car car2 = carFactory.getCar(CarType.COOL);
        car2.drivingExperience();
        Car car3 = carFactory.getCar(CarType.ECONOMICAL);
        car3.drivingExperience();
    }
}
