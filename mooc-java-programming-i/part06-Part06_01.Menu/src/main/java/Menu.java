
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public ArrayList<String> getMeals() {
        return this.meals;
    }

    public void addMeal(String meal) {
        if(this.getMeals().contains(meal)) {
            System.out.println("The meal already is on the menu.");
        } else {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for(String meal: this.getMeals()) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

}
