
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class ShoppingCart {

    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        if (products.containsKey(product)) {
            products.get(product).increaseQuantity();
        } else {
            products.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int priceTotal = 0;
        for (Item product : products.values()) {
            priceTotal += product.price();
        }
        return priceTotal;
    }

    public void print() {
        for (Item product : products.values()) {
            System.out.println(product);
        }
    }
}
