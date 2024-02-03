import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.getItems().isEmpty();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public int totalWeight() {
        int weight = 0; 
        for(Item item: this.getItems()) {
            weight += item.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if((this.totalWeight() + item.getWeight()) > this.maxWeight) {
            System.out.println("Item not added");
        } else {
            this.items.add(item);
        }
    }

    public String toString() {
        String items = this.getItems().size() == 1 ? " item" : " items";
        String size = this.getItems().size() == 0 ? "no" : String.valueOf(this.getItems().size());
        return size + items + " (" + String.valueOf(this.totalWeight()) + " kg)";
    }

    public void printItems() {
        for(Item item: this.getItems()) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if(this.isEmpty()) {
            return null;
        }
        Item heaviest = this.getItems().get(0);
        int weight = this.getItems().get(0).getWeight();
        for(Item item: this.getItems()) {
            if(item.getWeight() > weight) {
                weight = item.getWeight();
                heaviest = item;
            }
        }
        return heaviest;
    }
}
