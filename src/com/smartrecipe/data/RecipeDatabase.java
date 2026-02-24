package com.smartrecipe.data;

import com.smartrecipe.model.Difficulty;
import com.smartrecipe.model.Ingredient;
import com.smartrecipe.model.NutritionInfo;
import com.smartrecipe.model.Recipe;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class RecipeDatabase {
  private final List<Recipe> recipes = new ArrayList<>();

  public List<Recipe> getAllRecipes() {
    return recipes;
  }

  public void seed() {
    if (!recipes.isEmpty()) return;

    recipes.add(samplePasta());
    recipes.add(sampleSalad());
    recipes.add(sampleOmelette());
  }

  private Recipe samplePasta() {
    Recipe r = new Recipe();
    r.setId(UUID.randomUUID().toString());
    r.setTitle("Tomato Pasta (Basic)");
    r.setCuisine("Italian-ish");
    r.setDifficulty(Difficulty.EASY);
    r.setCookingTimeMinutes(25);
    r.setServings(2);
    r.getDietaryTags().add("vegetarian");
    r.getIngredients().add(new Ingredient("pasta", "200g"));
    r.getIngredients().add(new Ingredient("tomato", "2"));
    r.getIngredients().add(new Ingredient("garlic", "1 clove"));
    r.getSteps().add("Boil pasta.");
    r.getSteps().add("Cook tomato and garlic in a pan.");
    r.getSteps().add("Mix and eat.");
    r.setNutritionPerServing(new NutritionInfo(480, 14));
    return r;
  }

  private Recipe sampleSalad() {
    Recipe r = new Recipe();
    r.setId(UUID.randomUUID().toString());
    r.setTitle("Chickpea Salad (Basic)");
    r.setCuisine("Mediterranean-ish");
    r.setDifficulty(Difficulty.EASY);
    r.setCookingTimeMinutes(10);
    r.setServings(2);
    r.getDietaryTags().add("vegetarian");
    r.getDietaryTags().add("gluten-free");
    r.getIngredients().add(new Ingredient("chickpeas", "1 can"));
    r.getIngredients().add(new Ingredient("cucumber", "1"));
    r.getIngredients().add(new Ingredient("tomato", "1"));
    r.getSteps().add("Chop everything.");
    r.getSteps().add("Mix.");
    r.setNutritionPerServing(new NutritionInfo(300, 12));
    return r;
  }

  private Recipe sampleOmelette() {
    Recipe r = new Recipe();
    r.setId(UUID.randomUUID().toString());
    r.setTitle("Spinach Omelette (Basic)");
    r.setCuisine("Generic");
    r.setDifficulty(Difficulty.EASY);
    r.setCookingTimeMinutes(12);
    r.setServings(1);
    r.getDietaryTags().add("gluten-free");
    r.getIngredients().add(new Ingredient("eggs", "2"));
    r.getIngredients().add(new Ingredient("spinach", "1 cup"));
    r.getSteps().add("Whisk eggs.");
    r.getSteps().add("Cook with spinach.");
    r.setNutritionPerServing(new NutritionInfo(260, 17));
    return r;
  }
}


