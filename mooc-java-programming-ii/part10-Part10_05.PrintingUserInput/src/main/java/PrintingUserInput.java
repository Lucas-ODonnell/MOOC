
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userList = new ArrayList<>();
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()) {
                break;
            }
            userList.add(userInput);
        }
        userList.stream().forEach(li -> System.out.println(li));
    }
}
