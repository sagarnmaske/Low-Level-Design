package abstractFactoryDesignPattern;

public class ExperiencedITEmployeeFactory implements ITEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new ExperiencedITEmployee();
    }
}
