
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        int smallestNumber = 1000;
        while(true) {
            int userNumber = Integer.valueOf(scanner.nextLine());
            if(userNumber == 9999) {
                break;
            }
            smallestNumber = Math.min(smallestNumber, userNumber);
            list.add(userNumber);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        for(int i=0; i<list.size();i++) {
            if(smallestNumber == list.get(i)) {
                System.out.println("Smallest number: " + smallestNumber);
                System.out.println("Found at index: " + i);
            }
        }

        
    }
}
