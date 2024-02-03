
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        try (Scanner reading = new Scanner(Paths.get(file))) {
            while(reading.hasNextLine()) {
                int value = Integer.valueOf(reading.nextLine());
                if(value >= lowerBound && value <= upperBound) {
                    count += 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }
}
