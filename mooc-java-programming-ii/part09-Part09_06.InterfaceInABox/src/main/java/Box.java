import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for(Packable item: this.items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if(this.weight() + packable.weight() > this.maxCapacity) {
            System.out.println("Item not added");
        } else {
            this.items.add(packable);
        }
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
