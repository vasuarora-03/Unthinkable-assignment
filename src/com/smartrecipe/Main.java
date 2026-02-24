package com.smartrecipe;

import com.smartrecipe.data.RecipeDatabase;
import com.smartrecipe.logic.RecipeGenerator;
import com.smartrecipe.logic.RecipeQuery;
import com.smartrecipe.model.Recipe;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    RecipeDatabase db = new RecipeDatabase();
    db.seed(); 

    RecipeGenerator generator = new RecipeGenerator(db);

    RecipeQuery query = new RecipeQuery();
    query.addIngredient("tomato");
    query.addIngredient("pasta");
    query.setDietaryPreference("vegetarian");
    query.setMaxCookingTimeMinutes(30);
    query.setLimit(3);

    List<Recipe> recipes = generator.generate(query);
    for (Recipe r : recipes) {
      System.out.println("----");
      System.out.println(r.getTitle() + " (" + r.getCuisine() + ")");
      System.out.println("Time: " + r.getCookingTimeMinutes() + " min, Difficulty: " + r.getDifficulty());
      System.out.println("Calories/serving: " + r.getNutritionPerServing().getCalories());
      System.out.println("Steps: " + r.getSteps().size());
    }
  }
}


