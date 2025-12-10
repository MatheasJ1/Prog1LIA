import java.util.*;
/**
 * Write a description of class RcpBkDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RcpBkDriver
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // create recipebook with user input
        
        System.out.println("Welcome to the RecipeBook menu!");
        System.out.println("Please enter a name for you Recipe Book");
        String name = sc.nextLine();
        System.out.println("Please enter a owner for the book");
        String owner = sc.nextLine();
        System.out.println("Enter a year of publication for your book");
        String yearOfPublication = sc.nextLine();
        
        RecipeBook book = new RecipeBook(name, owner, yearOfPublication);
        
        boolean running = true;
        while (running){
            System.out.println(" --- MAIN MENU --- ");
            System.out.println(" 1. Print your book's details. ");
            System.out.println(" 2. List all recipes inside your book. ");
            System.out.println(" 3. Search for a recipe (Title, Ingredient, Type) .");
            System.out.println(" 4. Print a recipe's details. ");
            System.out.println(" 5. Rate a recipe. ");
            System.out.println(" 6. List the top rated recipes. ");
            System.out.println(" 7. Scale a recipe by it's servings. ");
            System.out.println(" 8. Add a recipe. ");
            System.out.println(" 9. Find a recipe. ");
            System.out.println(" 0. Exit. ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println(book.toString());
                    break;
                case 2:
                    book.listAllRecipes();
                    break;
                case 3:
                    book.searchRecipes();
                    break;
                case 4:
                    System.out.println("Please enter a recipe ID for it's details.");
                    int IdForDetails = sc.nextInt();
                    book.printRecipeDetails(IdForDetails);
                    break;
                case 5:
                    System.out.println(" Please enter a recipe's ID to rate. ");
                    int IdForRate = sc.nextInt();
                    System.out.println(" Enter a rating between 1-5. ");
                    int rating = sc.nextInt();
                    book.rateRecipe(IdForRate, rating);
                    break;
                case 6:
                    String top = book.listTopRatedRecipes();
                    if(top==null){
                        System.out.println("No top-rated recipes yet. ");
                    } else {
                        System.out.println("Top-rated recipes : ");
                        System.out.println(top);
                    }
                    break;
                case 7:
                    System.out.println(" Enter a recipe's ID to scale. ");
                    int IdToScale = sc.nextInt();
                    System.out.println(" Enter a new number of servings. ");
                    int newServings = sc.nextInt();
                    book.scaleByServings(IdToScale, newServings);
                    break;
                case 8:
                    System.out.println("Enter a ID for your recipe. ");
                    int Id = sc.nextInt();
                    System.out.println(" Enter recipe's title. ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.println(" Enter the recipe's description. ");
                    String description = sc.nextLine();
                    System.out.println(" Enter a number of servings. ");
                    int baseServings = sc.nextInt();
                    Recipe newRecipe = new Recipe(Id,title, description, baseServings);
                    book.addrecipe(newRecipe);
                    System.out.println(" Recipe successfully added with ID : " + newRecipe.getId());
                    break;
                case 9:
                    System.out.println(" Enter a recipe's ID to find. ");
                    int IdToFind = sc.nextInt();
                    sc.nextLine();
                    Recipe found = book.findRecipe(IdToFind);
                    
                    if (found == null){
                        System.out.println("No recipes with this ID were found. ");
                    } else {
                        System.out.println("Recipe has been found. ");
                        System.out.println(found);
                    }
                    break;
                case 10:
                    System.out.println("Enter a recipe's ID.");
                    int rID = sc.nextInt();
                    sc.nextLine();
                    
                    Recipe r = book.findRecipe(rID);
                    if (r == null){
                        System.out.println("Recipe not found");
                        break;
                    }
                    
                    System.out.println("Enter an Ingredient name.");
                    String ingName = sc.nextLine();
                    System.out.println("Enter a quantity");
                    double qty = sc.nextDouble();
                    sc.nextLine();
                    System.out.println ("Enter a unit : GRAM, MILLILITER, CUP, TABLESPOON, TEASPOON. Must be all Caps");
                    MeasurementUnit unit = MeasurementUnit.valueOf(sc.nextLine().toUpperCase());
                    Ingredient ing = new Ingredient(ingName, qty, unit);
                    r.addIngredients(ing);
                    System.out.println("Ingrediet successfully added.");
                    break;
                case 0:
                    System.out.println(" Goodbye! ");
                    running = false;
                    break;
                default:
                    System.out.println(" Please enter a valid choice. ");
            }
        }
    }
}