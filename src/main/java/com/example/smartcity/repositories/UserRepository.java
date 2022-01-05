package com.example.smartcity.repositories;

import com.example.smartcity.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    
    User findByEmail(String email);
}
