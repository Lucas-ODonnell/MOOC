import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public ArrayList<Suitcase> getSuitcases() {
        return this.suitcases;
    }

    public boolean isEmpty() {
        return this.getSuitcases().isEmpty();
    }

    public int totalWeight() {
        int weight = 0; 
        for(Suitcase suitcase: this.getSuitcases()) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() > this.maxWeight) {
            System.out.println("Suitcase was not added");
        } else {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for(Suitcase suitcase: this.getSuitcases()) {
            for(Item item: suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }

    public String toString() {
        return this.getSuitcases().size() + " suitcases (" + String.valueOf(this.totalWeight()) + " kg)";
    }
}
