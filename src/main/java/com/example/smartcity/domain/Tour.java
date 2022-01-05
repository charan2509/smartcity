package com.example.smartcity.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tour")
public class Tour {
    @Id
    private String id;

    private String name;
    private String famous;
    private String location;
    private String timings;
    private String ratings;
    private String desc;
    public Tour() {
    }
    public Tour(String id, String name, String famous, String location, String timings, String ratings, String desc) {
        this.id = id;
        this.name = name;
        this.famous = famous;
        this.location = location;
        this.timings = timings;
        this.ratings = ratings;
        this.desc = desc;
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
    public String getFamous() {
        return famous;
    }
    public void setFamous(String famous) {
        this.famous = famous;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTimings() {
        return timings;
    }
    public void setTimings(String timings) {
        this.timings = timings;
    }
    public String getRatings() {
        return ratings;
    }
    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    

    

}
