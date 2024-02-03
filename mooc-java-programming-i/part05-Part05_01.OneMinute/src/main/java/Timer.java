public class Timer {
    private ClockHand secondHand;
    private ClockHand centiSecondHand;

    public Timer() {
        this.secondHand = new ClockHand(60);
        this.centiSecondHand = new ClockHand(100);
    }

    public void advance() {
        this.centiSecondHand.advance();
        if (this.centiSecondHand.value() == 99) {
            this.secondHand.advance();
        }
    }

    public String toString() {
        return this.secondHand + ":" + this.centiSecondHand;
    }
    
}
