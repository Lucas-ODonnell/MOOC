import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        if(this.productPrices.get(product) == null) {
            return -99;
        }
        return this.productPrices.get(product);
    }

    public int stock(String product) {
        if(this.productStock.get(product) == null) {
            return 0;
        }
        return this.productStock.get(product);
    }

    public boolean take(String product) {
        if(this.productStock.get(product) != null && this.productStock.get(product) > 0) {
            int value = this.productStock.get(product);
            this.productStock.put(product, value-1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return this.productPrices.keySet();
    }
}
