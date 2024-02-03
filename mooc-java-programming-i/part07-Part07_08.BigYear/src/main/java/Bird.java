public class Bird {
    private String name; 
    private String latin; 
    private int count;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin; 
        this.count = 0;
    }

    public void increaseCount() {
        this.count += 1;
    }

    public String getName() {
        return this.name;
    }

    public String getLatin() {
        return this.latin;
    }

    public String toString() {
        return this.name + " (" + this.latin + "): " + this.count + " observations";
    }

}
