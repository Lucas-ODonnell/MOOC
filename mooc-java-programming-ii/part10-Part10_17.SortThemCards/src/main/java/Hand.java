import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public int countHand() {
        int count = 0;
        for(Card card: this.hand) {
            count += card.getValue();
        }
        return count;
    }

    public int compareTo(Hand compared) {
        if(compared.countHand() == this.countHand()) {
            return 0;
        }
        return this.countHand() - compared.countHand();
    }
}
