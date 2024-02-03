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
            if(userInput.equals("stop")) {
                break;
            } else if(userInput.equals("add")) {
               System.out.println("To add:");
               this.todoList.add(this.scanner.nextLine());
            } else if(userInput.equals("remove")) {
                System.out.println("Which one is removed?");
                Integer toRemove = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(toRemove);
            } else if(userInput.equals("list")) {
                this.todoList.print();
            }
        }

    }


    
}
