import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hash;

    public IOU() {
        this.hash = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.hash.put(this.standardizedString(toWhom), amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.hash.getOrDefault(this.standardizedString(toWhom), 0.0);
    }

    public String standardizedString(String string) {
        return string.toLowerCase().trim();
    }


    
}
