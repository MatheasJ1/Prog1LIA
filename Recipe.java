import java.util.*;

/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    private int Id;
    private String title;
    private String description;
    private int baseServing;
    private ArrayList<Ingredient> Ingredients;
    private String[] steps;
    private int totalRating;
    private int ratingCount;
    private RecipeType type;
    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(int Id, String title, String description,int baseServings)
    {
        this.Id = Id;
        this.title = title;
        this.description = description;
        this.baseServing = baseServings;
        this.Ingredients = new ArrayList<>();
        this.steps = new String[0];
        this.totalRating = 0;
        this.ratingCount = 0;
        this.type = null;
    }
    public int getId()
    {
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getBaseServings(){
        return baseServing;
    }
    public void setBaseServings(int baseServing){
        this.baseServing = baseServing;
    }
        public ArrayList<Ingredient> getIngredients(){
            return Ingredients;
    }
        public void addIngredients(Ingredient i){
         Ingredients.add(i);
    }
        public String[] getSteps(){
        return steps;
    }
    public void setSteps(String[] steps){
        {
            if( steps == null || steps.length == 0){
                System.out.println("There are no steps");
            } else {
                this.steps = steps;
            }
            
        }
    }
    public int getTotalRating(){
        return totalRating;
    }
    
    public double getAverageRating(){
        if(ratingCount == 0){
            return 0.0;
        }
        return (double) totalRating / ratingCount;
    }
    public void setTotalRating(int totalRating){
        this.totalRating = totalRating;
    }
    public int getRatingCount(){
        return ratingCount;
    }
    public void setRatingCount(int ratingCount){
        this.ratingCount = ratingCount;
    }
    public RecipeType getType(){
        return type;
    }
    public void setType(RecipeType type){
        this.type = type;
    }
    public String toString(){
        return "ID: " + Id +
            "\nTitle: " + title +
            "\nDescription: " + description +
            "\nBase Servings: " + baseServing +
            "\nIngredients: " + Ingredients +
            "\nSteps: " + String.join(", ", steps) +
            "\nAverage Rating: " + getAverageRating();
    }
}
