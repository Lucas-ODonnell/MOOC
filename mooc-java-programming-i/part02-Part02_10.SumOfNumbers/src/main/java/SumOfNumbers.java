
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (true) {
            System.out.println("Give a number:");
            int currentValue = Integer.valueOf(scanner.nextLine()); 
            if (currentValue == 0) {
                break;
            }
            answer += currentValue;
        }
        System.out.println("Sum of the numbers: " + answer);
    }
}
