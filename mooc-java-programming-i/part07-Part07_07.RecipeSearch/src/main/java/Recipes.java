import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Recipes {
    private ArrayList<String> recipesArray;

    public Recipes(String value) {
        this.recipesArray = new ArrayList<>();
        loadRecipes(value);
    }

    public void loadRecipes(String value) {
        try (Scanner file = new Scanner(Paths.get(value))) {
            String recipe = "";
            while(file.hasNextLine()) {
                String currentLine = file.nextLine();
                if(currentLine.isEmpty()) {
                    recipe = recipe.substring(0, recipe.length()-1);
                    this.recipesArray.add(recipe);
                    recipe = ""; 
                } else {
                    recipe += (currentLine + ",");
                }
            }
            recipe = recipe.substring(0, recipe.length()-1);
            this.recipesArray.add(recipe);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<String> getRecipes() {
        return this.recipesArray;
    }
    
    public void recipeList(ArrayList<String> recipes) {
        for(String recipe: recipes) {
            String[] current = recipe.split(",");
            System.out.println(this.toString(current));
        }
    }

    public ArrayList<String> findByName(String input) {
        ArrayList<String> recipes = new ArrayList<>();
        for(String recipe: this.getRecipes()) {
            if(recipe.contains(input)) {
                recipes.add(recipe);
            } 
        }
        return recipes;
    }

    public ArrayList<String> findByTime(int cookingTime) {
        ArrayList<String> recipes = new ArrayList<>();
        for(String recipe: this.getRecipes()) {
            String[] current = recipe.split(",");
            if(Integer.valueOf(current[1]) <= cookingTime) {
                recipes.add(recipe);
            }
        }
        return recipes;
    }

    public ArrayList<String> findByIngredient(String input) {
        ArrayList<String> recipes = new ArrayList<>();
        for(String recipe: this.getRecipes()) {
            String[] current = recipe.split(",");
            if(this.includes(current, input)) {
                recipes.add(recipe);
            } 
        }
        return recipes;
    }

    public Boolean includes(String[] array, String input) {
        for(String item: array) {
            if(item.equals(input) ) {
                return true;
            }
        }
        return false;
    }

    

    public String toString(String[] recipe) {
        return recipe[0] + ", cooking time: " + recipe[1];
    }
}
