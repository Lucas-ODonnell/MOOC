import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public ArrayList<Gift> getGifts() {
        return this.gifts;
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for(Gift gift: this.getGifts()) {
            weight += gift.getWeight();
        }
        return weight;
    }
    
}
