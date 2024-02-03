
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0]; 
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")) {
                firstContainer.add(amount);
            } else if(command.equals("remove")) {
                secondContainer.remove(amount);
            } else if (command.equals("move")) {
                int tmp = firstContainer.contains();
                if(tmp < amount) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                } else {
                    secondContainer.add(amount); 
                    firstContainer.remove(amount);
                }
            }

        }
    }

}
