
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int yearsSum = 0;
        String longName = "";

        while(true) {
            String userInfo = scanner.nextLine();
            if(userInfo.length() == 0) {
                break;
            }
            String[] arrayInfo = userInfo.split(",");
            if(arrayInfo[0].length() > longName.length()) {
                longName = arrayInfo[0];
            }
            yearsSum += Integer.valueOf(arrayInfo[1]);
            count += 1;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + yearsSum/(double)count);


    }
}
