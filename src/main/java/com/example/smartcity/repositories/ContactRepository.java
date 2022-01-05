package com.example.smartcity.repositories;

import com.example.smartcity.domain.Contact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    
}
