import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity; 
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if(item.getWeight() <= this.capacity) {
            this.capacity -= item.getWeight();
            this.items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for(Item currentItem: this.items) {
            if(currentItem.getName().equals(item.getName())) {
                return true;
            } 
        }
        return false;
    }
    
}
