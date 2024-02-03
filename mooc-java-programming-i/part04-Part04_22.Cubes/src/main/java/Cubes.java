
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            System.out.println(cubed(Integer.valueOf(number)));
        }
    }

    public static int cubed(int number) {
        return number * number * number;
    }
}
