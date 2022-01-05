package com.example.smartcity.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "entertainment")
public class Entertainment {
    @Id
    private String title;
    private String desc;
    private String address;
    private String timings;
    private String ratings;
    public Entertainment() {
    }
    public Entertainment(String title, String desc, String address, String timings, String ratings) {
        this.title = title;
        this.desc = desc;
        this.address = address;
        this.timings = timings;
        this.ratings = ratings;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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

    
}
