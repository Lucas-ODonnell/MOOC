
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for(int ele: array) {
            System.out.println(starConverter(ele));
        }
    }

    public static String starConverter(int num) {
        String star = "";
        for (int i=0; i< num; i++) {
            star += "*";
        }
        return star;
    }

}
