package com.example.smartcity.repositories;

import com.example.smartcity.domain.Hospital;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface HospitalRepository extends MongoRepository<Hospital, String>{
    
}
