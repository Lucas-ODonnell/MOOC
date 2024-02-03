public class Container {
    private int currentAmount;

    public Container() {
        this.currentAmount = 0;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        int total = this.currentAmount + amount;
        this.currentAmount = total > 100 ? 100 : total;
    }

    public void remove(int amount) {
        int total = this.currentAmount - amount;
        this.currentAmount = total < 0 ? 0 : total;
    }

    public String toString() {
        return this.currentAmount + "/100";
    }
    
}
