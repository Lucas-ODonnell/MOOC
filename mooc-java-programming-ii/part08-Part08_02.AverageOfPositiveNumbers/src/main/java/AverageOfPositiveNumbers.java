
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            } else if (input < 0) {
                System.out.println("Invalid");
            } else {

            list.add(input);
            }
        }
        average(list);
    }

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for(int number: list) {
            sum += number;
        }
        if(sum > 0) {
            System.out.println(sum/(double)list.size()); 
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
