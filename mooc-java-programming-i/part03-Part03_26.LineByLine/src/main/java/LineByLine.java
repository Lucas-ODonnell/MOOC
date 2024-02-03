
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String userInput = scanner.nextLine(); 
            if (userInput.length() == 0) {
                break;
            }
            String[] words = userInput.split(" ");
            for(String word: words) {
                System.out.println(word);
            }
        }

    }
}
