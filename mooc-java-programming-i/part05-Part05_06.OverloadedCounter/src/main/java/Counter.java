public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value() {
        return this.startValue;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            System.out.println("That is invalid");
        } else {
            this.startValue += increaseBy;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            System.out.println("This is invalid");
        } else {
            this.startValue -= decreaseBy;
        }
    }

    public void decrease() {
        this.decrease(1);
    }
    
}
