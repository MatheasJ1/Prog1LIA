

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
    
    @Test
public void testRateRecipe()
{
    Recipe r = new Recipe(0, "Soup", "Warm soup", 2);
    rb.addrecipe(r);  

    rb.rateRecipe(1, 5);
    rb.rateRecipe(1, 3);

    assertEquals(4.0, r.getAverageRating(), 0.0001);
}
@Test
public void testListTopRatedRecipes()
{
    Recipe r = new Recipe(0, "Cake", "Chocolate cake", 4);
    rb.addrecipe(r);  

    rb.rateRecipe(1, 5);
    rb.rateRecipe(1, 5);

    String result = rb.listTopRatedRecipes();

    assertNotNull(result);
    assertTrue(result.contains("Cake"));
}
@Test
public void testScaleByServings()
{
    Recipe r = new Recipe(0, "Cake", "desc", 4);
    r.addIngredients(new Ingredient("Flour", 200, MeasurementUnit.GRAM));
    r.addIngredients(new Ingredient("Sugar", 100, MeasurementUnit.GRAM));

    rb.addrecipe(r);

    rb.scaleByServings(1, 8); 

    assertEquals(8, r.getBaseServings()); // base servings update to 8

    assertEquals(400, r.getIngredients().get(0).getQuantity(), 0.0001); // flour scales from 200-400

    assertEquals(200, r.getIngredients().get(1).getQuantity(), 0.0001); // sugar scales from 100-200
}

@Test
public void testListByType()
{
    Recipe r1 = new Recipe(0, "Cake", "desc", 4);
    r1.setType(RecipeType.BAKED);

    Recipe r2 = new Recipe(0, "Soup", "desc", 3);
    r2.setType(RecipeType.SOUP);

    rb.addrecipe(r1); 
    rb.addrecipe(r2); 

    
    assertEquals(RecipeType.BAKED, rb.findRecipe(1).getType());
    assertEquals(RecipeType.SOUP, rb.findRecipe(2).getType());

    
}

@Test
public void testSearchRecipes()
{

    RecipeBook rb = new RecipeBook("Test", "Owner", "2024");

    Recipe r1 = new Recipe(0, "Tomato Soup", "desc", 3);
    r1.addIngredients(new Ingredient("Tomato", 2, MeasurementUnit.GRAM));
    rb.addrecipe(r1);

    Recipe r2 = new Recipe(0, "Chocolate Cake", "desc", 4);
    r2.addIngredients(new Ingredient("Chocolate", 100, MeasurementUnit.GRAM));
    rb.addrecipe(r2);

    rb.searchByTitle("Tomato Soup");
    assertEquals("Tomato Soup", rb.findRecipe(1).getTitle());

    rb.searchByIngredient("Chocolate");
    assertEquals("Chocolate Cake", rb.findRecipe(2).getTitle());
}

}

