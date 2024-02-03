import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        this.products.putIfAbsent(product, new Item(product, 0, price));
        this.products.get(product).increaseQuantity();
    }

    public int price() {
        int total = 0;
        for(Item thisItem: this.products.values()) {
            total += thisItem.price();
        }
        return total;
    }

    public void print() {
        for(Item thisItem: this.products.values()) {
            System.out.println(thisItem);
        }
    }
}
   
