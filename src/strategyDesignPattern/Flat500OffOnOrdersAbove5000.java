package strategyDesignPattern;

public class Flat500OffOnOrdersAbove5000 implements DiscountStrategy {
    @Override
    public int applyDiscount(int amount) {
        if (amount < 5000) {
            System.out.println("0 Discount Applied Order below 5000");
            return 0;
        }
        System.out.println("500 Discount Applied Order above 5000");
        return 500;
    }
}
