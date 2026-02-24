package com.smartrecipe.model;

public class NutritionInfo {
  private int calories;
  private double proteinGrams;

  public NutritionInfo() {}

  public NutritionInfo(int calories, double proteinGrams) {
    this.calories = calories;
    this.proteinGrams = proteinGrams;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public double getProteinGrams() {
    return proteinGrams;
  }

  public void setProteinGrams(double proteinGrams) {
    this.proteinGrams = proteinGrams;
  }
}


