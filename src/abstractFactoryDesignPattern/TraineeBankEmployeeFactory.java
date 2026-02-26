package abstractFactoryDesignPattern;

public class TraineeBankEmployeeFactory implements BankEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new TraineeBankEmployee();
    }
}
