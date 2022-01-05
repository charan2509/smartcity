package com.example.smartcity.repositories;

import com.example.smartcity.domain.Tour;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TourRepository extends MongoRepository<Tour, String> {
    
}
