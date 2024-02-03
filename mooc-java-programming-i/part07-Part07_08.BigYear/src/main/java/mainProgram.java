
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds();
        list();
        while(true) {
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Quit")) {
                break;
            } else if(command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                birds.addBird(name, latin);
            } else if(command.equals("Observation")) {
                System.out.println("Bird?");
                String seenBird = scan.nextLine();
                birds.addObservation(seenBird);
            } else if(command.equals("All")) {
                birds.all();
            } else if(command.equals("One")) {
                System.out.println("Bird?");
                String searchBird = scan.nextLine();
                System.out.println(birds.one(searchBird));
            } else {
                System.out.println("That is an invalid command!");
            }
        }
    }

    public static void list() {
        System.out.println("Add = adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - print all birds");
        System.out.println("One - print one bird");
        System.out.println("Quit - ends the program");
    }
}
