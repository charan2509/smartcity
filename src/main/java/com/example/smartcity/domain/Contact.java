package com.example.smartcity.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contact")

public class Contact {
    @Id
    private String id;

    private String email;
    private String name;
    private String mobile;
    private String desc;
    public Contact() {
    }
    public Contact(String id, String email, String name, String mobile, String desc) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.desc = desc;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }


    
}
