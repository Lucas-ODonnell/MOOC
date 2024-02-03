import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public ArrayList<Bird> getBirds() {
        return this.birds;
    }

    public void all() {
        for(Bird bird: this.birds) {
            System.out.println(bird.toString());
        }
    }

    public Bird one(String name) {
        for(Bird bird: this.getBirds()) {
            if(bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public void addBird(String name, String latin) {
        this.getBirds().add(new Bird(name, latin));
    }

    public void addObservation(String name) {
        Bird bird = this.one(name);
        if(bird != null) {
            bird.increaseCount();
        } else {
            System.out.println("Not a bird!");
        }
    }
}
