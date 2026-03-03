package strategyDesignPattern;

public class Flat100OffOnOrdersAbove1000 implements DiscountStrategy {
    @Override
    public int applyDiscount(int amount) {

        if (amount < 1000) {
            System.out.println("0 Discount Applied Order Below 1000");
            return 0;
        }
        System.out.println("100 Discount Applied Order Above 1000");
        return 100;
    }
}
