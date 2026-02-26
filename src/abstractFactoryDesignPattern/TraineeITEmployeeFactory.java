package abstractFactoryDesignPattern;

public class TraineeITEmployeeFactory implements ITEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new TraineeITEmployee();
    }
}
