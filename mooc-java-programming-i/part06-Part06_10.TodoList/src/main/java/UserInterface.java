import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String userInput = this.scanner.nextLine();
            if(userInput.equals("add")) {
                System.out.println("To add:");
                String task = this.scanner.nextLine();
                this.todoList.add(task);
            } else if (userInput.equals("list")) {
                this.list();
            } else if (userInput.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(this.scanner.nextLine());
                this.remove(remove);
            } else if (userInput.equals("stop")) {
                this.stop();
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }

    public void stop() {
        System.out.println("Exiting");
    }

    public void add(String value) {
        this.todoList.add(value);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove(int number) {
        this.todoList.remove(number-1);
    }
}
