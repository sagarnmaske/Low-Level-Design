package abstractFactoryDesignPattern;

public class ExperienceBankEmployeeFactory implements BankEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new ExperienceBankEmployee();
    }
}
