package singletonPattern;

public class LoggerController {

    public void checkInstances() {
        Logger first = Logger.getInstance();
        Logger second = Logger.getInstance();
        Logger third = Logger.getInstance();

    }
}
