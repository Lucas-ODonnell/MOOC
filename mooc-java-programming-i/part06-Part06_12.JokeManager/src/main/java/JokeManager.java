import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            int random = (int)(Math.random() * this.jokes.size());
            return this.jokes.get(random);
        }
    }

    public void printJokes() {
        for(String joke: this.jokes) {
            System.out.println(joke);
        }
    }
    
}
