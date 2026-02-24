package com.smartrecipe.logic;

import java.util.ArrayList;
import java.util.List;


public class RecipeQuery {
  private List<String> ingredients = new ArrayList<>();
  private String dietaryPreference; 
  private Integer maxCookingTimeMinutes;
  private String difficulty;
  private int limit = 5;
  private int servings = 1;

  public void addIngredient(String ingredient) {
    if (ingredient == null) return;
    ingredients.add(ingredient);
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public String getDietaryPreference() {
    return dietaryPreference;
  }

  public void setDietaryPreference(String dietaryPreference) {
    this.dietaryPreference = dietaryPreference;
  }

  public Integer getMaxCookingTimeMinutes() {
    return maxCookingTimeMinutes;
  }

  public void setMaxCookingTimeMinutes(Integer maxCookingTimeMinutes) {
    this.maxCookingTimeMinutes = maxCookingTimeMinutes;
  }

  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getServings() {
    return servings;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }
}


