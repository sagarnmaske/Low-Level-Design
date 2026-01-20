package decoratorDesignPattern;

public class Cheez extends DecoratorPizza {

    public Cheez(BasePizza basePizza) {
        price = basePizza.price + 20;
    }
}
