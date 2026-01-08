package factoryPattern;

public class CarFactory {
    public Car getCar(CarType carType) {
        switch (carType){
            case COOL -> {
                return new LuxuryCar();
            }
            case FAST -> {
                return new SportsCar();
            }
            case ECONOMICAL -> {
                return new EconomicalCar();
            }
            default -> {
                return null;
            }
        }
    }
}
