
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true) {
            int current = Integer.valueOf(scanner.nextLine());
            if(current > 0) {
                count += 1;
                sum += current;
            } else if(current == 0) {
                break;
            }
        }
        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(sum/(float) count);

    }
}
