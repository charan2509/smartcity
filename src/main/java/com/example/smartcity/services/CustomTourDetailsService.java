package com.example.smartcity.services;

import com.example.smartcity.domain.Tour;
import com.example.smartcity.repositories.TourRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomTourDetailsService {
    
    @Autowired
    private TourRepository tourRepository;

    public Iterable<Tour> allTourDetails() {
        return tourRepository.findAll();
    }
    public Tour addTour(Tour tour) {
        return tourRepository.save(tour);
    }

}
