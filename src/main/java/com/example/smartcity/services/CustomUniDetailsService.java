package com.example.smartcity.services;
import com.example.smartcity.domain.Uni;
import com.example.smartcity.repositories.UniRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomUniDetailsService {

    @Autowired
    private UniRepository uniRepository;

    public Iterable<Uni> allUniDetails() {
        return uniRepository.findAll();
    }

    public Uni addUni(Uni uni) {
        return uniRepository.save(uni);
    }
    
}
