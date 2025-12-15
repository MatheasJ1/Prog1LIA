

PROJECT TITLE:
Recipe Book Application

PURPOSE OF PROJECT:
The purpose of this project is to create a simple digital recipe book.
The program stores different types of recipes (such as Soup, Fried, and
Baked), along with their ingredients, steps, tags, and ratings. Users can
search for recipes, view details, scale servings, rate dishes, and add
their own recipes. The project demonstrates object-oriented programming,
basic data structures, and simple menu-based interaction.

VERSION or DATE:December 2, 2025

HOW TO START THIS PROJECT EXTERNALLY AND THROUGH BLUEJ:
Internally
1. Compile all .java files in the project.
2. Run the main driver class (usually named Main, Driver, or RecipeBook).
3. The program will display a menu in the console.
4. Follow the on-screen options to navigate through the recipe book.

Externally
How to Start:

1. Make sure you have Java and a terminal or command prompt.

2. The project has several .java files that need to be compiled first.

3. Run the main class (RcpBkDriver) to start the program.

4. Enter the recipe book’s name, owner, and year when asked.

5. The main menu will appear. From there, you can:

    1. List all recipes

    2. See full recipe details

    3. Search recipes by title, ingredient, or type

    4. Rate recipes

    5.Scale recipe servings

    6. Add new recipes

    7. Find recipes by ID

6 Running the program this way is the same as in BlueJ, but using the terminal instead.

AUTHORS:Anthony O'Sullivan, Matheas Jarrouj

USER INSTRUCTIONS:

Features: 
Users can add recipes with automatically assigned IDs, set recipe types (Baked, Fried, or Soup), include ingredients with units 
(GRAM, MILLILITER, CUP, TABLESPOON, TEASPOON), list all recipes, view detailed information, search by title, ingredient, or type, 
rate recipes, see average ratings, view top-rated recipes, and scale ingredient amounts based on servings.

How It Works: 
Each recipe contains a title, description, number of servings, type, ingredients, and average rating, while each ingredient 
includes a name, quantity, and unit. When the program starts, it asks for the recipe book’s name, owner, and year, then displays a
menu with options to print book details, list recipes, search, view full recipe details, rate recipes, see top-rated recipes, 
scale servings, add new recipes, find recipes by ID, or exit.

Recipe IDs: 
Automatically generated and used for finding, rating, and scaling recipes.

Error Handling: 
The program provides messages for invalid IDs, ratings outside the allowed range, or when no recipes exist.