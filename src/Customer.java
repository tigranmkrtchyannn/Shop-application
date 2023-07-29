public class Customer {
    private ShoppingCart cart;

    public Customer(ShoppingCart cart)
    {
        this.cart = cart;
    }



    public void addProductToCart(Product product){
        cart.addProduct(product);
    }
    public void removeProductFromCart(Product product){

        cart.removeProduct(product);
    }
    public ShoppingCart purches() {
        for (int i = 0; i < cart.getCartItem().size(); i++) {
          cart.removeProduct(cart.getCartItem().get(i));

        }
        return cart;
    }
}
