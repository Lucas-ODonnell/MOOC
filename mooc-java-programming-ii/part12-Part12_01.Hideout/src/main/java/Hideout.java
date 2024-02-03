import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hide;

    public Hideout() {
        this.hide = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if(this.hide.isEmpty()) {
            this.hide.add(toHide);
        } else {
            this.takeFromHideout();
            this.hide.add(toHide);
        }
    }

    public T takeFromHideout() {
        if(this.hide.isEmpty()) {
            return null;
        }
        T take = this.hide.remove(0);
        return take;
    }

    public boolean isInHideout() {
        return !this.hide.isEmpty();
    }

    
}
