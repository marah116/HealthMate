package com.example.healthmate;


public class FoodItem {

    private String name;
    private double caloriesPerGram; //

    public FoodItem(String name, double caloriesPerGram) {
        this.name = name;
        this.caloriesPerGram = caloriesPerGram;

    }

    public String getName() {
        return name;
    }

    public double getCaloriesPerGram() {
        return caloriesPerGram;
    }




    @Override
    public String toString() {
        return name + " - " + caloriesPerGram + " calories/gram";
    }
}
