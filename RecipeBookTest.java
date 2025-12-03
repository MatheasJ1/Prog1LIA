

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RecipeBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecipeBookTest
{
    private RecipeBook rb;
    @BeforeEach
    public void setUp()
    {
        rb = new RecipeBook("My Book", "Anthony", "2049");
    }
    
    /**
     * Default constructor for test class RecipeBookTest
     */
    @Test
    public void RecipeBookTestConstructor()
    {
        assertNotNull(rb, "RecipeBook object should be created successfully");
    }

    /**
     * Sets up the test fixture.
     *
     * Test adding a recipe and assigns and stores the recipe
     */
    @Test
    public void testAddRecipe()
    {
        Recipe r = new Recipe(0, "Pastitsio", "Greek pastitsio", 2);
        
        rb.addrecipe(r);
        
        Recipe found = rb.findRecipe(r.getId());
        
        //Make possible to find
        assertNotNull(found);
        assertEquals("Pastitsio", found.getTitle());
    }

    /**
     * Test findRecipe for a recipe that exists
     *
     * Called after every test case method.
     */
    @Test
    public void testFoundRecipe()
    {
        Recipe r = new Recipe(0, "Soup", "Warm soup", 4);
        //Makes the recipeBook and the recipe to test
        rb.addrecipe(r);
        //adds the new recipe soup to the book
        Recipe found = rb.findRecipe(r.getId());
        //puts the id to 1
        assertNotNull(found);
        assertEquals("Soup", found.getTitle());
        
    }
    

    /**
     * Test find recipe for No recipe ID
     */
    @Test
    public void testNotFoundRecipe(){
        
        Recipe notFound = rb.findRecipe(999);
    
        assertNull(notFound);
        
    }
    
    /**
     * Test adding many Recipes gives unique increasing ids
     */
    @Test
    public void testAutoId()
    {
                
        Recipe r1 = new Recipe(0, "Soup", "Warm soup", 3);
        Recipe r2 = new Recipe(0, "Pizza", "Meatlovers pizza", 6);
        
        rb.addrecipe(r1);
        rb.addrecipe(r2);
        
        assertNotEquals(r1.getId(), r2.getId());
        assertTrue(rb.findRecipe(r1.getId()) != null);
        assertTrue(rb.findRecipe(r2.getId()) != null);
    }
}