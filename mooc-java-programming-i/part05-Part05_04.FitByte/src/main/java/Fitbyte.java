public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public int getAge() {
        return this.age;
    }

    public int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.getAge());
        return ((maxHeartRate - this.getRestingHeartRate()) * (percentageOfMaximum) + this.getRestingHeartRate());
    }
    
}
