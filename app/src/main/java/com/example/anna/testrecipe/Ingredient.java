package com.example.anna.testrecipe;

/**
 * Created by Anna on 28.12.2016.
 */

public class Ingredient {

    private String title;
    private String quantity;

    public Ingredient(String title, String quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String toString() {
        return this.title + " " + this.quantity;
    }
}
