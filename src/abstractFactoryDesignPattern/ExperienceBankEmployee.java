package abstractFactoryDesignPattern;

public class ExperienceBankEmployee extends BankEmployee {
    @Override
    public void doSomething() {
        System.out.println("Experienced BankEmployee,Doing something");
    }
}
