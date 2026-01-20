package decoratorDesignPattern;

public class Toppings extends DecoratorPizza {
    public Toppings(BasePizza pizza) {
        price = pizza.price + 30;
    }
}
