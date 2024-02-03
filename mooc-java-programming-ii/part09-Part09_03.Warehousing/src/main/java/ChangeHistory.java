import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public double minValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double minimum = 999999.0;
        for(double num: this.changeHistory) {
            minimum = Math.min(minimum, num);
        }
        return minimum;
    }

    public double maxValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double max = 0.0;
        for(double num: this.changeHistory) {
            max = Math.max(max, num);
        }
        return max;
    }

    public double average() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double answer = 0.0;
        for(double num: this.changeHistory) {
            answer += num;
        }
        return answer/this.changeHistory.size();
    }

    public void clear() {
        this.changeHistory = new ArrayList<>();
    }

    public String toString() {
        return this.changeHistory.toString();
    }
    
}
