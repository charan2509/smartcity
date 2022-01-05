package com.example.smartcity.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
public class Hotel {
    @Id
    private String id;

    private String name;
    private String location;
    private String category;
    private String rating;
    private String rent;

    
    public Hotel() {
    }


    public Hotel(String id, String name, String location, String category, String rating, String rent) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.rating = rating;
        this.rent = rent;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getRating() {
        return rating;
    }


    public void setRating(String rating) {
        this.rating = rating;
    }


    public String getRent() {
        return rent;
    }


    public void setRent(String rent) {
        this.rent = rent;
    }
    
    
    

}
