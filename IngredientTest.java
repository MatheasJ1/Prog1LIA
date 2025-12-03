

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class IngredientTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IngredientTest
{
    /**
     * Default constructor for test class IngredientTest
     */
    @Test
    public void testConstrcutor()
    {
        Ingredient i = new Ingredient("Flour", 500, MeasurementUnit.GRAM);

        assertEquals("Flour", i.getName());
        assertEquals(500, i.getQuantity());
        assertEquals(MeasurementUnit.GRAM, i.getUnit());
        
    }

    @Test
    public void testGetName()
    {
        Ingredient ingredie1 = new Ingredient("Flour", 500, MeasurementUnit.GRAM);
        assertEquals("Flour", ingredie1.getName());
    }

    @Test
    public void testSetName()
    {
        Ingredient ingredie1 = new Ingredient("Flour", 500, MeasurementUnit.GRAM);
        assertEquals("Flour", ingredie1.getName());
        ingredie1.setName("Floour");
    }

    @Test
    public void testGetQuantity()
    {
        Ingredient ingredie1 = new Ingredient("Flour", 500, MeasurementUnit.GRAM);
        ingredie1.setQuantity(450.1);
    }
}




