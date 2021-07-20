package com.isoas.fooddinnerdietblogwithfirebase.models;

import java.util.List;

public class RecipeModals {
    String name;
    List<Ingredients> ingredients;
    List<String> steps;
    List<Integer> timers;
    String imageURL;
    String originalURL;

    public RecipeModals() {
    }

    public RecipeModals(String name, List<Ingredients> ingredients, List<String> steps, List<Integer> timers, String imageURL, String originalURL) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.timers = timers;
        this.imageURL = imageURL;
        this.originalURL = originalURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public List<Integer> getTimers() {
        return timers;
    }

    public void setTimers(List<Integer> timers) {
        this.timers = timers;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }
}
