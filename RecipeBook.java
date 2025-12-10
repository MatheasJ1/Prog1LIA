import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
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
    
    public void searchByTitle(String title){
        for (Recipe r : recipes){
            if (r.getTitle().equals(title)){
                System.out.println(r);
            }
        }
    }
    public void searchByIngredient(String Ingredient){
        for (Recipe r : recipes){
            if (r.getIngredients().equals(Ingredient)){
                System.out.println(r);
            }
        }
    }
    public void searchByType(String type){
         for (Recipe r : recipes){
             if (r.getType().toString().equalsIgnoreCase(type)){
                 System.out.println(r);
             }
         }
    }
    public void searchRecipes()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println(" --- SEARCH MENU ---");
        System.out.println("1. SEARCH BY TITLE");
        System.out.println("2. SEARCH BY INGREDIENT");
        System.out.println("3. SEARCH BY TYPE.");
        System.out.println("0. RETURN TO MAIN MENU");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter a title to search");
                String title = sc.nextLine();
                searchByTitle(title);
                break;
            case 2:
                System.out.println("Enter an Ingredient to search");
                String Ingredient = sc.nextLine();
                searchByIngredient(Ingredient);
                break;
            case 3:
                System.out.println("Enter an type to search.");
                String type = sc.nextLine();
                searchByType(type);
                break;
            case 0:
                System.out.println("Returning to main menu");
            default:
                System.out.println("Please enter a choice.");
        }
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
        for (Recipe r : recipes){
            if (r.getId() == (recipeId)){
                System.out.println("Please enter your rating for :" + r.getTitle() + " .");
            } 
            if (rating < 1 || rating > 5){
                System.out.println("Please enter a rating between 1 and 5.");
            } else {
                 rating = r.getTotalRating()  + rating;
                r.setTotalRating(rating);
            }
        }
    }
    
    public String listTopRatedRecipes()
    {   for( Recipe r : recipes){
        if (r.getAverageRating() > 4.2){
                return r.getId() + " " + r.getTitle() + " " 
                + r.getDescription();
        }
    }
    if (recipes.isEmpty()){
            System.out.println("There are no recipes.");
        }
    
    return null;
    }
    public void scaleByServings(int recipeId, int newServings)
    {
       Recipe r = findRecipe(recipeId);
       
       if (r==null){
           System.out.println("Invalid recipe ID.");
           return;
       }
       int oldServings = r.getBaseServings();
       double factor = (double)newServings / oldServings;
       
       for (Ingredient ing : r.getIngredients()){
           ing.setQuantity(ing.getQuantity() * factor);
       }
       
       r.setBaseServings(newServings);
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
    
    @Override
    public String toString() {
    return "Recipe Book: " + name +
    "\nOwner: " + owner +
    "\nYear: " + yearOfPublication +
    "\nTotal Recipes: " + recipes.size() +
     "\nRecipes:";

    }
    @Override
    public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof RecipeBook)) return false;

    RecipeBook other = (RecipeBook) obj;

    return this.name.equals(other.name);
    }

}