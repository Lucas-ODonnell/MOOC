
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String longest() {
        if(this.getElements().isEmpty()) {
            return null;
        }
        int biggestNumber = 0;
        String longestString = "";
        for(String string: this.getElements()) {
            if(string.length() > biggestNumber) {
                biggestNumber = string.length();
                longestString = string;
            }
        }
        return longestString;
    }

}
