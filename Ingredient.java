
/**
 * Write a description of class Ingredient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingredient
{
    // instance variables - replace the example below with your own
    private String name;
    private double quantity;
    private MeasurementUnit unit;
    /**
     * Constructor for objects of class Ingredient
     */
    public Ingredient(String name, double quantity, MeasurementUnit unit)
    {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public void setUnit(MeasurementUnit unit){
        this.unit = unit;
    }
    public MeasurementUnit getUnit(){
        return unit;
    }
    public String toString(){
        return "Ingredient : " + name + quantity + unit;
    }
}
