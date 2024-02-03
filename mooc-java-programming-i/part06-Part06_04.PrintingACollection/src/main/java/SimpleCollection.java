
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if(this.getElements().isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 
        int i = 0;
        int listSize = this.getElements().size();
        String elementString = listSize == 1 ? " element:" : " elements:";
        String collection = "The collection " + this.name + " has " + this.getElements().size() + elementString + "\n";
        for(String element: this.getElements()) {
            if (i < listSize - 1) {
                collection = collection + element + "\n";
            } else {
                collection = collection + element;
            }
            i++;
        }
        return collection;
    }
    
}
