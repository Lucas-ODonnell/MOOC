
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        fromWhere = fromWhere < 0 ? 0 : fromWhere;
        toWhere = toWhere > array.length ? array.length : toWhere;
        if(toWhere > array.length) {
            toWhere = array.length;
        }
        while(fromWhere < toWhere) {
            int current = array[fromWhere];
            if(!(current < smallest || current > largest)) {
                sum += current;
            }
            fromWhere += 1;
        }
        return sum;
    }

}
