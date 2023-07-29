import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Warehouse {
    private HashMap<Product,Integer> productsMap ;

    public Warehouse(HashMap<Product,Integer>productsMap) {
     this.productsMap = productsMap;
    }
    public void addProduct(Product product,int count) {
        productsMap.put(product,count);
    }

    public void removeProduct(Product product,int count){
       this.productsMap.remove(product,count);
    }

    public Integer getPtoductQountity(Product product){
        return productsMap.get(product);
    }

}
