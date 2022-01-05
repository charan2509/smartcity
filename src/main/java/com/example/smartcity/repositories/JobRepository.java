package com.example.smartcity.repositories;

import com.example.smartcity.domain.Job;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {
    
}
