import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scan;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }

    public void start() {
        while(true) {
            this.printOptions();
            String userInput = this.userInput();
            if(userInput.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.userInput();
                this.jokes.addJoke(joke);
            } else if(userInput.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if(userInput.equals("3")) {
                this.jokes.printJokes();
            } else if(userInput.equals("X")) {
                break;
            }
        }

    }

    public void printOptions() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

    public String userInput() {
        return this.scan.nextLine();
    }
}
