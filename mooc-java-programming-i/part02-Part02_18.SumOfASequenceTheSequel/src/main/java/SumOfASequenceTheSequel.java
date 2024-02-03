
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        while(firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber += 1;
        }
        System.out.println("The sum is " + sum);
    }
}
