import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public SimpleDictionary getDictionary() {
        return this.dictionary;
    }

    public void start() {
        while(true) {
            Scanner scanner = this.getScanner();
            System.out.println("Command");
            String response = scanner.nextLine();
            if(response.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (response.equals("add")) {
                System.out.println("Word:");
                String key = scanner.nextLine();
                System.out.println("Translation:");
                String value = scanner.nextLine();
                this.getDictionary().add(key, value);
            } else if(response.equals("search")) {
                System.out.println("To be translated:");
                String key = scanner.nextLine();
                String value = this.getDictionary().translate(key);
                if(value == null) {
                    System.out.println("Word " + key + " was not found");
                } else {
                    System.out.println("Translation: " + value);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
