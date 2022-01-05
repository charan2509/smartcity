package com.example.smartcity.repositories;

import com.example.smartcity.domain.Entertainment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntertainmentRepository extends MongoRepository<Entertainment, String> {
    
}
