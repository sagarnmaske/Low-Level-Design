package strategyDesignPattern;

import java.util.Scanner;

public class DiscountController {

    public static void controlDiscounts() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the discount amount: ");
        int amount = input.nextInt();

        int totalDiscount = 0;
        DiscountStrategy flat5PercetageDiscountStrategy = new Flat5PercetageDiscountStrategy();
        DiscountStrategy flat100OffOnOrdersAbove1000 = new Flat100OffOnOrdersAbove1000();
        DiscountStrategy flat500OffOnOrdersAbove5000 = new Flat500OffOnOrdersAbove5000();

        totalDiscount += flat5PercetageDiscountStrategy.applyDiscount(amount);
        totalDiscount += flat100OffOnOrdersAbove1000.applyDiscount(amount);
        totalDiscount += flat500OffOnOrdersAbove5000.applyDiscount(amount);

        System.out.println("Total Discount Applied:" + totalDiscount);
        int amountToPayAfterDiscount = amount - totalDiscount;
        System.out.println("Final Amount to be Paid:" + amountToPayAfterDiscount);

    }
}
