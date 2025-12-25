package shoppingcartSystem;

public class CartItem {
    private Product product;
    private int count;

    CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCartItemPrice() {
        return product.getPrice() * count;
    }

    public String getProductName() {
        return this.product.getProductName();
    }
}
