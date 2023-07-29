import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    private Warehouse warehouse;


    public Shop(ArrayList<Product> products,Warehouse warehouse){
     this.products = products;
     this.warehouse = warehouse;
    }


    public void addProduct(Product product){

        products.add(product);

    }

    public void removeProduct(Product product){

        products.remove(product);

    }

    public Product getProduct(int i){

            return products.get(i);

    }

}
