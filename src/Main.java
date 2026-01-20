
import chainOfResponsibilityPattern.LogHandler;
import decoratorDesignPattern.PizzaCreator;

public class Main {
    public static void main(String[] args) {
//        LogHandler logHandler = new LogHandler();
//        logHandler.handleLog("tree");
        PizzaCreator pizzaCreator = new PizzaCreator();
        pizzaCreator.createPizza();
    }
}