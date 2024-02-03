import java.util.ArrayList;

public class MisplacingBox extends Box{
    private ArrayList<Item> dumbBox; 

    public MisplacingBox() {
        this.dumbBox = new ArrayList<>();
    }

    public void add(Item item) {
        this.dumbBox.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
    
}
