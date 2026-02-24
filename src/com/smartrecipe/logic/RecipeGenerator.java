package com.smartrecipe.logic;

import com.smartrecipe.data.RecipeDatabase;
import com.smartrecipe.model.Recipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RecipeGenerator {
  private final RecipeDatabase db;

  public RecipeGenerator(RecipeDatabase db) {
    this.db = db;
  }

  public List<Recipe> generate(RecipeQuery query) {
    if (query == null) return Collections.emptyList();

    List<Recipe> result = new ArrayList<>();
    for (Recipe r : db.getAllRecipes()) {
      if (!matchesDiet(query, r)) continue;
      if (!matchesTime(query, r)) continue;
      if (!matchesIngredients(query, r)) continue;
      result.add(r);
      if (result.size() >= query.getLimit()) break;
    }

    for (Recipe r : result) {
      r.setServings(query.getServings());
    }

    return result;
  }

  private boolean matchesDiet(RecipeQuery q, Recipe r) {
    if (q.getDietaryPreference() == null) return true;
    return r.getDietaryTags().contains(q.getDietaryPreference());
  }

  private boolean matchesTime(RecipeQuery q, Recipe r) {
    if (q.getMaxCookingTimeMinutes() == null) return true;
    return r.getCookingTimeMinutes() <= q.getMaxCookingTimeMinutes();
  }

  private boolean matchesIngredients(RecipeQuery q, Recipe r) {
    if (q.getIngredients() == null || q.getIngredients().isEmpty()) return true;
    for (String wanted : q.getIngredients()) {
      if (wanted == null) continue;
      String w = wanted.toLowerCase().trim();
      for (var ing : r.getIngredients()) {
        if (ing.getName() != null && ing.getName().toLowerCase().contains(w)) {
          return true;
        }
      }
    }
    return false;
  }
}


