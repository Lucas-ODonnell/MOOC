
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String userInput = scanner.nextLine();
        Recipes recipes = new Recipes(userInput);

        commands();
        while(true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            if(input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                System.out.println("Recipes:");
                recipes.recipeList(recipes.getRecipes());
            } else if (input.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                System.out.println("Recipes:");
                recipes.recipeList(recipes.findByName(searchedWord));
            } else if(input.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                recipes.recipeList(recipes.findByTime(cookingTime));
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                recipes.recipeList(recipes.findByIngredient(ingredient));
            }
        }
    }

    public static void commands() {
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient"); 
    }
}
