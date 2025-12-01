import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    

public class RecipeBook
{
    private String name;
    private String owner;
    private String yearOfPublication;
    private ArrayList<Recipe> recipes;
    private static int nextRecipeId = 1;

    public RecipeBook(String name, String owner, String yearOfPublication)
    {
        this.name = name;
        this.owner = owner;
        this.yearOfPublication = yearOfPublication;
        this.recipes = new ArrayList<Recipe>();
    }

    public void printBookDetails()
    {
        System.out.println("Recipe Book: " + name);
        System.out.println("Owner: " + owner);
        System.out.println("Published: " + yearOfPublication);
        System.out.println("Total Recipes: " + recipes.size());
    }

    public void listAllRecipes()
    {
        if (recipes.isEmpty()) {
            System.out.println("There are no recipes in this book.");
        } else {
            for (Recipe r : recipes) {
                System.out.println(r.getId() + ": " + r.getTitle());
            }
        }
    }
    public void listByType(RecipeType type)
    {
        boolean found = false;
        for (Recipe r : recipes) {
            if (r.getType() == type) {
                System.out.println(r.getId() + ": " + r.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found for type: " + type);
        }
    }

    
    public void searchRecipes(String criteria, String query)
    {
        
    }

    public void printRecipeDetails(int recipeId)
    {
        Recipe r = findRecipe(recipeId);

        if (r == null) {
            System.out.println("Recipe not found.");
        } else {
            System.out.println(r.toString());
        }
    }
    
    public void rateRecipe(int recipeId, int rating)
    {
        
    }
    
    public void listTopRatedRecipes()
    {
        
    }

    public void scaleByServings(int recipeId, int newServings)
    {
        
    }

    public void addrecipe(Recipe recipe){
        recipe.setId(nextRecipeId++);
        recipes.add(recipe);
    }
    public Recipe findRecipe(int id){
        for (Recipe r : recipes)  {
            if (r.getId() == id){
                return r;
            }
        }
        return null;
    }
}