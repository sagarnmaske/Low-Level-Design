package shoppingcartSystem;

public class Product {
    private int productId;
    private String productName;
    private int price;

    Product(int id, String name, int p) {
        productId = id;
        price = p;
        productName = name;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getProductId() {
        return this.productId;
    }
}
