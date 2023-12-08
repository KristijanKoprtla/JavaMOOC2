
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        productStock.put(product, stock);
    }
    public int price(String product) {
        return products.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        int currentStock = stock(product);
        if(currentStock > 0){
            this.productStock.put(product, currentStock - 1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products(){
        return products.keySet();
    }
    
}
