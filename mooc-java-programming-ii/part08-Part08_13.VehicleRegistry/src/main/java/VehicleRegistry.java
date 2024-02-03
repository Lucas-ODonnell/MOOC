import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> car;

    public VehicleRegistry() {
        this.car = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.car.containsKey(licensePlate)) {
            return false;
        } else {
            this.car.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.car.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if(this.car.containsKey(licensePlate)) {
            this.car.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for(LicensePlate license: this.car.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        ArrayList<String> alreadySeen = new ArrayList<>();
        for(String owner: this.car.values()) {
            if(!alreadySeen.contains(owner)) {
                alreadySeen.add(owner);
                System.out.println(owner);
            }
        }
    }
    
}
