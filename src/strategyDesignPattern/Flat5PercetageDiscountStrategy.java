package strategyDesignPattern;

public class Flat5PercetageDiscountStrategy implements DiscountStrategy {
    @Override
    public int applyDiscount(int amount) {
        int discount = amount * 5 / 100;
        System.out.println("Flat 5 Percentage Discount: " + discount);
        return discount;
    }
}
