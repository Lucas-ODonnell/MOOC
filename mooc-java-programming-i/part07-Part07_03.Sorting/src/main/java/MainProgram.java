import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        int smallest = 999;
        for(int ele: array) {
            smallest = Math.min(smallest, ele);
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == smallest) {
                answer = i;
            }
        }
        return answer;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] modifiedArray = Arrays.copyOfRange(table, startIndex, table.length);
        return indexOfSmallest(modifiedArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2]; 
        array[index2] = tmp;
    }
}
