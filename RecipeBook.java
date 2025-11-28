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
    private String YearOfPublication;
    private ArrayList<Recipe> recipes;
    private static int nextRecipeId;
    
    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook(String name, String owner, String YearOfPublication)
    {
       this.name = name;
       this.owner = owner;
       this.YearOfPublication = YearOfPublication;
        recipes = new ArrayList<Recipe>();
    }
    
    public void printBookDetails(){
        System.out.println("The name of the book is " + name + 
        " and the owner of the book is " + owner);
    }
    public void listAllRecipes(){
            System.out.println(recipes);
    }
    
    public void listByType(RecipeType type){
        
    }
    public void searchRecipes(String criteria, String query){
        
    }
    public void printRecipeDetails(int recipeId){
        
    }
    public void rateRecipe(int recipeId, int rating){
         
    }
    public void listTopRatedRecipes(){}
    public void scaleByServings(int recipeId, int newServings){}
    public void addrecipe(Recipe recipe){}
    
}