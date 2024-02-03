public class LiquidContainer {
    private int amount;

    public LiquidContainer() {
        this.amount = 0;
    }

    public int getAmount() {
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

    public void move(LiquidContainer container, int value) {
        if(this.greaterThanZero(value)) {
            this.remove(value);
            container.add(value);
        } else {
            int remaining = this.getAmount();
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
    
}
