package application;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private int value;

    public TemperatureSensor() {
        this.value = 0;
    }

    public boolean isOn() {
        return this.value == 1;
    }

    public void setOn() {
        this.value = 1;
    }

    public void setOff() {
        this.value = 0;
    }

    public int read() {
        if(!isOn()) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }

}
