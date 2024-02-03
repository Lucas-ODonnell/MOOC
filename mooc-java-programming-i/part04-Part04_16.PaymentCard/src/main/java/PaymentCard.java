public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatAffordably() {
        if(!outOfMoney(2.60)) {
           this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if(!outOfMoney(4.60)) {
           this.balance -= 4.60;
        }
    }

    public boolean outOfMoney(double amount) {
        if(this.balance - amount < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addMoney(double amount) {
        if(this.balance + amount > 150) {
            this.balance = 150;
        } else if(amount < 0) {
            System.out.println("You can't add a negative amount");
        } else {
            this.balance += amount;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
}
