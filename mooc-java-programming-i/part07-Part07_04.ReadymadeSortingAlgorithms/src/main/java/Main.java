import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        integers.sort((a1,a2) -> a1.compareTo(a2));
    }

    public static void sortStrings(ArrayList<String> strings) {
        strings.sort((a1,a2) -> a1.compareTo(a2));
    }
}
