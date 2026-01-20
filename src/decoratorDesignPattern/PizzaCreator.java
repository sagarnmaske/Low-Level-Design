package decoratorDesignPattern;

public class PizzaCreator {
    public void createPizza() {
        BasePizza1 basePizza1 = new BasePizza1();
        DecoratorPizza decoratorPizza = new Cheez(basePizza1);
        DecoratorPizza decoratorPizza1 = new Toppings(decoratorPizza);
        DecoratorPizza decoratorPizza2 = new Toppings(decoratorPizza1);
        System.out.println("Total Pizza cost is:" + decoratorPizza2.price);
    }
}
