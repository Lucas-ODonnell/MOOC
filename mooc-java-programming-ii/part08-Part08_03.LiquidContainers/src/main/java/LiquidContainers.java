
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer first = new LiquidContainer();
        LiquidContainer second = new LiquidContainer();


        while (true) {
            System.out.println("First: " + first.getAmount() + "/100");
            System.out.println("Second: " + second.getAmount() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if(parts[0].equals("add")) {
                first.add(Integer.valueOf(parts[1]));
            } else if(parts[0].equals("move")) {
                first.move(second, Integer.valueOf(parts[1]));
            } else if (parts[0].equals("remove")) {
                second.remove(Integer.valueOf(parts[1]));
            }
        }
    }
}
