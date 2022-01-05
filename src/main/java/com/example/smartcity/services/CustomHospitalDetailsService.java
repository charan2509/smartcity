package com.example.smartcity.services;

import com.example.smartcity.domain.Hospital;
import com.example.smartcity.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomHospitalDetailsService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public Iterable<Hospital> allHospitalDetails() {
        return hospitalRepository.findAll();
    }

    public Hospital addHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }
}
