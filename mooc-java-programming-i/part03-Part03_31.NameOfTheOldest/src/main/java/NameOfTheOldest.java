
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0; 
        String name = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.length() == 0) {
                break;
            }
            String[] group = input.split(",");
            if (Integer.valueOf(group[1]) > oldest) {
                oldest = Integer.valueOf(group[1]);
                name = group[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
