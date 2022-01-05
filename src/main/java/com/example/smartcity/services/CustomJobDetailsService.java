package com.example.smartcity.services;
import com.example.smartcity.domain.Job;
import com.example.smartcity.repositories.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomJobDetailsService {
    
    @Autowired
    private JobRepository jobRepository;

    public Iterable<Job> allJobDetails() {
        return jobRepository.findAll();
    }

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }
}
