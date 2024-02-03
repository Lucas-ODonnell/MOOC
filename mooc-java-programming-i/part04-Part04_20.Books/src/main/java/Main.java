import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            String pages = scanner.nextLine();
            System.out.println("Publication Year:");
            String year = scanner.nextLine();
            bookList.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String toBePrinted = scanner.nextLine();
        if (toBePrinted.equals("everything")) {
            for(Book book: bookList) {
                System.out.println(book.printEverything());
            }
        } else if(toBePrinted.equals("name")) {
            for(Book book: bookList) {
                System.out.println(book.getTitle());
            }
        }
    }
}
