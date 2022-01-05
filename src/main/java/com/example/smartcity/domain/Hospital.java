package com.example.smartcity.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "hospital")
public class Hospital {

    @Id
    private String id;

    private String name;
    private String address;
    private String areas;
    private String contact;
    private String website;
    private String covid;
    public Hospital() {
    }
    public Hospital(String id, String name, String address, String areas, String contact, String website,
            String covid) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.areas = areas;
        this.contact = contact;
        this.website = website;
        this.covid = covid;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAreas() {
        return areas;
    }
    public void setAreas(String areas) {
        this.areas = areas;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getCovid() {
        return covid;
    }
    public void setCovid(String covid) {
        this.covid = covid;
    }


    

}
