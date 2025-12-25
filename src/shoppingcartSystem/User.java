package shoppingcartSystem;

public class User {
    private int userId;
    private String username;
    private Cart cart;

    public User(int userId,String username,Cart cart){
        this.cart = cart;
        this.username = username;
        this.userId = userId;
    }

    public Cart getCart(){
        return this.cart;
    }

    public void viewCart(){
        System.out.println(this.cart);
    }
}
