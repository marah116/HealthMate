package com.example.healthmate;

public class Center {
    private String name;
    private String description;
    private String phone;
    private String hours;
    private String location;
    private String services;

    // Constructor
    public Center(String name, String description, String phone, String hours, String location, String services) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.hours = hours;
        this.location = location;
        this.services = services;
    }

    // Getter methods for each property
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }

    public String getHours() {
        return hours;
    }

    public String getLocation() {
        return location;
    }

    public String getServices() {
        return services;
    }
}
