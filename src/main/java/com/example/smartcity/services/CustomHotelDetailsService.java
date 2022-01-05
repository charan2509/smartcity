package com.example.smartcity.services;
import com.example.smartcity.domain.Hotel;
import com.example.smartcity.repositories.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomHotelDetailsService {
    
    @Autowired
    private HotelRepository hotelRepository;

    public Iterable<Hotel> allHotelDetails() {
        return hotelRepository.findAll();
    }

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
