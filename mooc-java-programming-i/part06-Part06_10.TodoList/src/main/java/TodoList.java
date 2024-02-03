import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String string) {
        this.tasks.add(string);
    }

    public void remove(int number) {
        this.tasks.remove(number);
    }

    public void print() {
        for(int i = 0; i < this.tasks.size(); i++) {
            System.out.println(i + 1 + ": " + this.tasks.get(i));
        }
    }
    
}
