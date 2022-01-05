package com.example.smartcity.services;


import com.example.smartcity.domain.Entertainment;
import com.example.smartcity.repositories.EntertainmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomEntertainmentDetailsService {
    @Autowired
    private EntertainmentRepository entertainmentRepository;

    public Iterable<Entertainment> allEntertainmentDetails() {
        return entertainmentRepository.findAll();
    }

    public Entertainment addEntertainment(Entertainment entertainment) {
        return entertainmentRepository.save(entertainment);
    }
}
