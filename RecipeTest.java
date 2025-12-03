

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RecipeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecipeTest
{
    /**
     * Default constructor for test class RecipeTest
     */
    public RecipeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    

    @Test
    public void testGetId()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        assertEquals(1, recipe1.getId());
    }

    @Test
    public void testSetId()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        recipe1.setId(2);
        assertEquals(2, recipe1.getId());
    }

    @Test
    public void testGetTitle()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        assertEquals("choco", recipe1.getTitle());
    }

    @Test
    public void testSetTitle()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        recipe1.setTitle("chocolate");
        assertEquals("chocolate", recipe1.getTitle());
    }

    @Test
    public void testGetDesc()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        assertEquals("ch", recipe1.getDescription());
    }

    @Test
    public void testSetDesc()
    {
        Recipe recipe1 = new Recipe(1, "choco", "ch", 1);
        recipe1.setDescription("chocolate cake");
        assertEquals("chocolate cake", recipe1.getDescription());
    }

    @Test
    public void testGetBaseServings()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 2);
        assertEquals(2, recipe1.getBaseServings());
    }

    @Test
    public void testSetBaseServings()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 2);
        recipe1.setBaseServings(5);
        assertEquals(5, recipe1.getBaseServings());
    }

    @Test
    public void testGetIngredient()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 1);
        Ingredient carrot = new Ingredient("carrot", 500, MeasurementUnit.GRAM);
        recipe1.addIngredients(carrot);
        assertEquals(carrot, recipe1.getIngredients());
    }

    @Test
    public void testSetAndGetIngredients()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 1);
        Ingredient carrot = new Ingredient("carrot", 1, MeasurementUnit.CUP);
        recipe1.addIngredients(carrot);
        assertEquals(carrot, recipe1.getIngredients());
    }

    @Test
    public void testGetAndSetTotalRating()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 1);
        recipe1.setTotalRating(15);
        assertEquals(15, recipe1.getTotalRating());
        recipe1.setTotalRating(1);
        assertEquals(1, recipe1.getTotalRating());
    }

    @Test
    public void testGetAndSetRatingCount()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 1);
        assertEquals(0, recipe1.getRatingCount());
        recipe1.setRatingCount(1);
        assertEquals(1, recipe1.getRatingCount());
    }

    @Test
    public void testGetAverageRating()
    {
        Recipe recipe1 = new Recipe(1, "c", "h", 1);
        recipe1.setTotalRating(25);
        recipe1.setRatingCount(15);
        assertEquals(18, recipe1.getAverageRating(), 0.1);
    }

}















