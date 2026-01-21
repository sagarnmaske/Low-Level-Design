package templateDesignPattern;

public abstract class Payment {
    public final void pay() {
        authoriseUser();
        checkEnoughBalance();
        makePayment();
    }

    abstract public void authoriseUser();

    abstract public void checkEnoughBalance();

    abstract public void makePayment();
}
