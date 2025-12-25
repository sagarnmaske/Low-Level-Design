package shoppingcartSystem;

public class UserCartController {

    public void createCartSystem(){
        User user1 = new User(1,"sagar",new Cart(1));
        Cart user1Cart = user1.getCart();
        Product product1 = new Product(11,"Laptop",1000);
        Product product2 = new Product(12,"Mobile",200);
        Product product3 = new Product(13,"Charger",10);
        user1Cart.addItemToCart(product1,1);
        user1Cart.addItemToCart(product2,2);
        user1Cart.addItemToCart(product3,5);
        System.out.println(user1Cart.getTotalCart());
        System.out.println(user1Cart);
    }


}
