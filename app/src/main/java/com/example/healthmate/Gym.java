package com.example.healthmate;

public class Gym {
    private String name;
    private String description;
    private int imageResId;

    public Gym(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    @Override
    public String toString() {
        return name ;
    }
}
