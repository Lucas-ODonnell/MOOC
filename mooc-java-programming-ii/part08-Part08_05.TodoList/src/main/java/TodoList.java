import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void remove(int value) {
        this.tasks.remove(value - 1);
    }

    public void print() {
        for(int i = 0; i < this.tasks.size(); i++) {
            System.out.println(i + 1 + ": " + this.tasks.get(i));
        }
    }
}
