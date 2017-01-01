package com.example.anna.testrecipe;

/**
 * Created by Anna on 28.12.2016.
 */

public class Recipe {

    private int rid;
    private String title;
    private String photo;
    private String description;
    private String preperation;
    private Ingredient ingredient;
    private int rating;
    private String[] categories;

    public Recipe(int rid, String title, String photo, String description, String preperation, Ingredient ingredient, int rating, String[] categories) {
        this.rid = rid;
        this.title = title;
        this.photo = photo;
        this.description = description;
        this.preperation = preperation;
        this.ingredient = ingredient;
        this.rating = rating;
        this.categories = categories;
    }

}
