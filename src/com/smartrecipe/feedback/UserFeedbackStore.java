package com.smartrecipe.feedback;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UserFeedbackStore {
  private final Map<String, Set<String>> favoritesByUser = new HashMap<>();
  private final Map<String, Map<String, Integer>> ratingsByUser = new HashMap<>();

  public void saveFavorite(String userId, String recipeId) {
    favoritesByUser.computeIfAbsent(userId, k -> new HashSet<>()).add(recipeId);
  }

  public void removeFavorite(String userId, String recipeId) {
    Set<String> f = favoritesByUser.get(userId);
    if (f != null) f.remove(recipeId);
  }

  public boolean isFavorite(String userId, String recipeId) {
    Set<String> f = favoritesByUser.get(userId);
    return f != null && f.contains(recipeId);
  }

  public void rate(String userId, String recipeId, int rating) {
    if (rating < 1) rating = 1;
    if (rating > 5) rating = 5;
    ratingsByUser.computeIfAbsent(userId, k -> new HashMap<>()).put(recipeId, rating);
  }

  public Integer getRating(String userId, String recipeId) {
    Map<String, Integer> m = ratingsByUser.get(userId);
    return m == null ? null : m.get(recipeId);
  }
}


