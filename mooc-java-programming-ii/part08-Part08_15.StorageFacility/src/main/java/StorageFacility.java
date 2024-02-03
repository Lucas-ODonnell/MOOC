import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storedItems;

    public StorageFacility() {
        this.storedItems = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storedItems.putIfAbsent(unit, new ArrayList<>());
        this.storedItems.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(this.storedItems.get(storageUnit) == null) {
            return new ArrayList<>();
        } else {
            return this.storedItems.get(storageUnit);
        }
    }

    public void remove(String storageUnit, String item) {
        if(this.storageUnitIsNotEmpty(storageUnit)) {
            System.out.println("Invalid");
        }
        if(this.storedItems.get(storageUnit).size() == 1) {
            this.storedItems.remove(storageUnit);
        } else {
            this.storedItems.get(storageUnit).remove(this.storedItems.get(storageUnit).indexOf(item));
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> newList = new ArrayList<>();
        for(String key: this.storedItems.keySet()) {
            if(this.storedItems.get(key) != null) {
                newList.add(key);
            }
        }
        return newList;
    }

    public boolean storageUnitIsNotEmpty(String storageUnit) {
        return this.storedItems.get(storageUnit) != null;
    }
}
