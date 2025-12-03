
/**
 * Write a description of class Fried here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fried extends Recipe
{
    // instance variables - replace the example below with your own
    public Fried(int Id, String title, String description, int baseServings){
       super(Id, title, description, baseServings);
       setType(RecipeType.FRIED);
    }
}