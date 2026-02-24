package com.smartrecipe.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recipe {
  private String id;
  private String title;
  private String cuisine;
  private Difficulty difficulty = Difficulty.EASY;
  private int cookingTimeMinutes;
  private int servings = 1;
  private Set<String> dietaryTags = new HashSet<>();

  private List<Ingredient> ingredients = new ArrayList<>();
  private List<String> steps = new ArrayList<>();
  private NutritionInfo nutritionPerServing = new NutritionInfo();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCuisine() {
    return cuisine;
  }

  public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
  }

  public Difficulty getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  public int getCookingTimeMinutes() {
    return cookingTimeMinutes;
  }

  public void setCookingTimeMinutes(int cookingTimeMinutes) {
    this.cookingTimeMinutes = cookingTimeMinutes;
  }

  public int getServings() {
    return servings;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }

  public Set<String> getDietaryTags() {
    return dietaryTags;
  }

  public void setDietaryTags(Set<String> dietaryTags) {
    this.dietaryTags = dietaryTags;
  }

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public List<String> getSteps() {
    return steps;
  }

  public void setSteps(List<String> steps) {
    this.steps = steps;
  }

  public NutritionInfo getNutritionPerServing() {
    return nutritionPerServing;
  }

  public void setNutritionPerServing(NutritionInfo nutritionPerServing) {
    this.nutritionPerServing = nutritionPerServing;
  }
}


