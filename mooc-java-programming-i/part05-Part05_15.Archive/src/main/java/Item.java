public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        if(!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;
        if(this.identifier.equals(comparedItem.getIdentifier())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.getIdentifier() + ": " + this.getName(); 
    }
    
}
