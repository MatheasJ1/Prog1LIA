import java.util.*;
/**
 * Write a description of class Soup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soup extends Recipe
{
/**
     * Constructor for objects of class Soup
     */
    public Soup(int Id, String title, String description, int baseServings)
    {
        super(Id, title, description, baseServings); // Calling parent class
        setType(RecipeType.SOUP); // setting enum type
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here

}
}