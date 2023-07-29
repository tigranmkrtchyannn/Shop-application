import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Product phone = new PhysicalProduct("Sansung", 450000, 0.5);
        Product macBook = new DigitalProduct("MacBook - Pro", 2_000_000, 5);

        ArrayList<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(macBook);

        Warehouse warehouse = new Warehouse(new HashMap<>());
        warehouse.addProduct(phone,2);

        warehouse.addProduct(macBook,4);

        Shop shop = new Shop(products,warehouse);

        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        Customer customer = new Customer(cart);

        customer.addProductToCart(macBook);
        customer.addProductToCart(phone);
        customer.removeProductFromCart(macBook);


        System.out.println("macbook count " + warehouse.getPtoductQountity(macBook));

        System.out.println("phone count "+ warehouse.getPtoductQountity(phone));
    }
}
