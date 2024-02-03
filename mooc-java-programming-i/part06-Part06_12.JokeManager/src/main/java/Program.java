import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //JokeManager manager = new JokeManager();
        //Scanner scanner = new Scanner(System.in);
        //UserInterface ui = new UserInterface(manager, scanner);
        //ui.start();
        
        JokeManager manager = new JokeManager();
manager.addJoke("Just joking 1");
manager.addJoke("Just joking 2");
manager.addJoke("Just joking 3");
manager.drawJoke();
manager.drawJoke();
manager.drawJoke();
    }
}
