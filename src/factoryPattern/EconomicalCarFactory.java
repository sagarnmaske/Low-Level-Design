package factoryPattern;

public class EconomicalCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new EconomicalCar();
    }
}
