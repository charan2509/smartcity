package com.example.smartcity.repositories;

import com.example.smartcity.domain.Uni;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UniRepository extends MongoRepository<Uni, String> {
    
}
