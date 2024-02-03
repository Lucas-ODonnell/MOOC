import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card a, Card b) {
        int order = a.getSuit().ordinal() - b.getSuit().ordinal();
        if(order == 0) {
            return a.compareTo(b);
        }
        return order;
    }
    
}
