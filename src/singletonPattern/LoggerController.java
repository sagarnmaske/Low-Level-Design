package singletonPattern;

public class LoggerController {

    public void checkInstances() {
        Logger first = Logger.getInstance();
        Logger second = Logger.getInstance();
        Logger third = Logger.getInstance();
        System.out.println(first.equals(second));
        System.out.println(second == third);
        System.out.println(first == third);
    }
}
