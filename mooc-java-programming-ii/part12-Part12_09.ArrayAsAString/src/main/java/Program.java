
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        String string = "";
        for(int i = 0; i < array.length; i++) {
            StringBuilder section = new StringBuilder();
            for(int j = 0; j < array[i].length; j++ ) {
                section.append(array[i][j]);
            }
            string += section.toString() + "\n";
        }
        return string;
    }
}
