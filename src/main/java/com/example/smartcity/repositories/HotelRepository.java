package com.example.smartcity.repositories;

import com.example.smartcity.domain.Hotel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
    
}
