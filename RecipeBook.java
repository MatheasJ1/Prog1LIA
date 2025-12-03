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
    public void listByType(String type)
    {
        /*if ( this.type.equals("Baked")){
            for every recipe of baked type
            print baked.recipes
            set found to true
            else if (this.type.equals("Soup"){
                for every recipe of soup type
                print soup.recipes
                set found to true
            } else if{
                this.type.equals("Fried"){
                    for every recipe of fried type
                    print fried.recipes
                    set found to true
                }
            }
        }
          if found = false
          print "The Type may be Invalid or you may have a typo. Please enter
          a valid type."*/
        }
    
    public void searchRecipes(String criteria, String query)
    {
        /*set query to lowercase
        set found to false
        
        if recipe.title contains query then
        print recipe.Id and recipe.Title
        set found to true
        end if
        
        else if criteria = "ingredient" then
        for each ingredients in recipe.ingredients 
        if recipe.ingredient contains query then
        print recipe.Id and recipe.Title
        set found to true
        break loop
        
        else if criteria = "tag" then
        for each tag in tag.tags 
        if tag.tags contains query then
        print recipe.Id and recipe.Title
        set found to true
        break loop
        
        if found = false
        print "No results found."*/
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
        /*
        if Id == null
        print "Invalid Id. Please enter a valid recipe ID."
        
        if rating > 1 || rating < 5
        totalRating = this.recipeId.getTotalRating() + this.rating;
        RatingCount = Rating count + 1;*/
    }
    
    public String listTopRatedRecipes()
    {
        for( Recipe r : recipes){
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