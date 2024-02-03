
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
            .map(currentRow -> currentRow.split(","))
            .filter(parts -> parts.length >= 2)
            .map(param -> new Book(param[0], Integer.valueOf(param[1]), Integer.valueOf(param[2]), param[3]))
            .forEach(book -> books.add(book));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
