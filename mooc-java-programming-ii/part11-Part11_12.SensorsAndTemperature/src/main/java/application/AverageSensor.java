package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
   private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

    public boolean isOn() {
        for (Sensor sensor: this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        int amount = 0;
        for (Sensor sensor: this.sensors) {
            int readValue = sensor.read();
            sum += readValue;
            amount += 1;
        }
        this.readings.add(sum / amount);
        return sum / amount;
    } 
}
