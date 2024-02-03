import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> oib;

    public OneItemBox() {
        this.oib = new ArrayList<>();
    }

    public void add(Item item) {
        if(this.oib.isEmpty()) {
            this.oib.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.oib.contains(item);
    }
}
