
/**
 * Write a description of class Baked here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baked extends Recipe
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Baked
     */
    public Baked(int Id, String title, String description, int baseServings)
    {
        super(Id, title, description, baseServings);// Calling parent class constructor
        setType(RecipeType.BAKED); // setting enum type
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