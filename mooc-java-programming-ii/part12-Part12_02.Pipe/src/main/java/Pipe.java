import java.util.LinkedList;

public class Pipe<T> {
    private LinkedList<T> pipe;

    public Pipe() {
        this.pipe = new LinkedList<>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        if(this.pipe.isEmpty()) {
            return null;
        }
        return this.pipe.removeFirst();
    }

    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }
    
}