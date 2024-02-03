
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0; 
        int secondContainer = 0;
        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
 
            if (command.equals("add") && amount >= 0) {
                int tmp = firstContainer + amount;
                firstContainer = tmp > 100 ? 100 : tmp;
            } else if (command.equals("move")) {
                int tmp = firstContainer - amount;
                secondContainer = tmp < 0 ? secondContainer + firstContainer  > 100 ? 100 : secondContainer + firstContainer : secondContainer + amount > 100 ? 100 : secondContainer + amount;
                firstContainer = tmp < 0 ? 0 : tmp; 
            } else if (command.equals("remove")) {
                int tmp = secondContainer - amount;
                secondContainer = tmp < 0 ? 0 : tmp;
            } else {
                System.out.println("nothing was printed");
            }
        }
    }
}
