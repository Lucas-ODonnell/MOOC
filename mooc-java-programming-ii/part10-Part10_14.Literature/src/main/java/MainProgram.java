
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true) {
            System.out.println("Input the name of the books, empty stops:");
            String userInput1 = scanner.nextLine();
            if(userInput1.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int userInput2 = Integer.valueOf(scanner.nextLine());

            books.add(new Book(userInput1, userInput2));
        }
        Comparator<Book> compareNameAge = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books, compareNameAge);
        System.out.println(books.size() + " books in total.");
        books.stream().forEach(book -> System.out.println(book));
    }

}
