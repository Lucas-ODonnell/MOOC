
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.numbers = new ArrayList<>();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random generator = new Random();
        this.numbers = new ArrayList<>();
        int i = 0; 
        while(i < 7) {
            int number = generator.nextInt(40) + 1;
            if(!(this.containsNumber(number))) {
                this.numbers.add(number); 
                i += 1;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

