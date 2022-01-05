package com.example.smartcity.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "education")
public class Uni {
    @Id
    private String id;

    private String name;
    private String location;
    private String branches;
    private String employees;
    private String contact;
    private String rating;
    private String estd;
    public Uni() {
    }
    public Uni(String id, String name, String location, String branches, String employees, String contact,
            String rating, String estd) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.branches = branches;
        this.employees = employees;
        this.contact = contact;
        this.rating = rating;
        this.estd = estd;
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
    public String getBranches() {
        return branches;
    }
    public void setBranches(String branches) {
        this.branches = branches;
    }
    public String getEmployees() {
        return employees;
    }
    public void setEmployees(String employees) {
        this.employees = employees;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getEstd() {
        return estd;
    }
    public void setEstd(String estd) {
        this.estd = estd;
    }

    
    

    

}