package abstractFactoryDesignPattern;

public class AbstractFactoryManager {
    public static void manageFactory() {
        EmployeeFactory factory1 = new ExperiencedITEmployeeFactory();
        Employee emp1 = factory1.createEmployee();
        emp1.doSomething();

        EmployeeFactory factory2 = new TraineeITEmployeeFactory();
        Employee emp2 = factory2.createEmployee();
        emp2.doSomething();

        EmployeeFactory factory3 = new ExperienceBankEmployeeFactory();
        Employee emp3 = factory3.createEmployee();
        emp3.doSomething();

        EmployeeFactory factory4 = new TraineeBankEmployeeFactory();
        Employee emp4 = factory4.createEmployee();
        emp4.doSomething();
    }
}

