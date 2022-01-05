package com.example.smartcity.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "job")
public class Job {
    @Id
    private String id;

    private String title;
    private String qualifications;
    private String experience;
    private String location;
    private String timings;
    private String salary;
    private String desc;
    public Job() {
    }
    public Job(String id, String title, String qualifications, String experience, String location, String timings,
            String salary, String desc) {
        this.id = id;
        this.title = title;
        this.qualifications = qualifications;
        this.experience = experience;
        this.location = location;
        this.timings = timings;
        this.salary = salary;
        this.desc = desc;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getQualifications() {
        return qualifications;
    }
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
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
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    

    

    

    
}
