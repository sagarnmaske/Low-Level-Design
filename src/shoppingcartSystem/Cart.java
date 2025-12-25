package shoppingcartSystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final int userId;
    private List<CartItem> cartItemList;

    Cart(int id) {
        userId = id;
        cartItemList = new ArrayList<>();
    }

    public void addItemToCart(Product product, int count) {
        CartItem cartItem = new CartItem(product, count);
        System.out.println(count + " "+ product.getProductName() + " Added To " + this.userId + " Cart");
        cartItemList.add(cartItem);
    }

    public int getTotalCart() {
        int total = 0;
        for (CartItem cartItem : cartItemList) {
            total += cartItem.getCartItemPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CartItem cartItem : cartItemList) {
            sb.append(cartItem.getProductName());
            sb.append(cartItem.getCartItemPrice());
            sb.append("  + ");
        }

        return sb.toString();

    }


}
