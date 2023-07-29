import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<Product> cartItem;

    public ShoppingCart(ArrayList<Product> products) {
       this.cartItem = products;

    }


    public void addProduct(Product product) {
        cartItem.add(product);
    }

    public void removeProduct(Product product) {
        cartItem.remove(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0 ;i < this.cartItem.size();i++) {
            total += cartItem.get(i).getPrice();

        }
        return total;
    }

    public ArrayList<Product> getCartItem() {
        return cartItem;
    }


}


