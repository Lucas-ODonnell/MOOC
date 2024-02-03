
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.length() == 0) {
                break;
            }
            String[] group = input.split(",");
            oldest = Math.max(oldest, Integer.valueOf(group[1]));
        }
        System.out.println("Age of the oldest: " + oldest);


    }
}
