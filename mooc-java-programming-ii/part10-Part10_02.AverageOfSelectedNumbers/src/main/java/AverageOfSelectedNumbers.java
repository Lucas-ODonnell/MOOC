
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.equals("end")) {
                break;
            }
            list.add(userInput);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        String reply = scanner.nextLine();
        double answer = 0;
        if(reply.equals("n")) {
            answer = list.stream().mapToInt(ele -> Integer.valueOf(ele)).filter(value -> value < 0).average().getAsDouble();
            System.out.println(answer);

        } else if (reply.equals("p")) {
            answer = list.stream().mapToInt(ele -> Integer.valueOf(ele)).filter(value -> value >= 0).average().getAsDouble();
            System.out.println(answer);
        } else {
            System.out.println("Follow the instructions");
        }
    }
}
