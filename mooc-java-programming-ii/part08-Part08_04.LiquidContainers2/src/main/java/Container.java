public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount; 
    }

    public void add(int value) {
        if(value < 0) {
            System.out.println("Invalid");
        } else if(this.lessThanHundred(value)) {
            this.amount += value;
        } else {
            this.amount = 100;
        }
    }

    public void move(Container container, int value) {
        if(this.greaterThanZero(value)) {
            this.remove(value);
            container.add(value);
        } else {
            int remaining = this.contains();
            container.add(remaining);
            this.amount = 0;
        }
    }

    public void remove(int value) {
        if(this.greaterThanZero(value)) {
            this.amount -= value;
        } else {
            this.amount = 0;
        }
    }

    public boolean lessThanHundred(int value) {
        return (this.amount + value) <= 100;
    }

    public boolean greaterThanZero(int value) {
        return (this.amount - value) >= 0;
    }

    public String toString() {
        return this.contains() + "/100";
    }
}

