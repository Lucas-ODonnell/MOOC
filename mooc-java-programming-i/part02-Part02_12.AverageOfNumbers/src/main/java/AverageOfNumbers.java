
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true) {
            System.out.println("Give a number:");
            int current = Integer.valueOf(scanner.nextLine());
            if (current == 0) {
                break;
            }
            count += 1; 
            sum += current;
        }
        System.out.println("Average of the numbers: " + (sum/(float) count));
    }
}
