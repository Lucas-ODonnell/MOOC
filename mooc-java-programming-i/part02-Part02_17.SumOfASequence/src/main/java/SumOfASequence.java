
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("Last number?");
        int userInput = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= userInput; i++) {
            answer += i;
        }
        System.out.println("The sum is " + answer);
    }
}
