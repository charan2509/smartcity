package com.example.smartcity.controllers;

import com.example.smartcity.domain.Hotel;
import com.example.smartcity.services.CustomHotelDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class HotelController {
    @Autowired
    private CustomHotelDetailsService hotelService;


    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public ModelAndView allHotels() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Hotel> hotels = hotelService.allHotelDetails();
        modelAndView.addObject("hotels", hotels);
        modelAndView.setViewName("hotels");
        return modelAndView;
        
    }

    @RequestMapping(value = "/addhotels", method = RequestMethod.GET)
    public ModelAndView hotels() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addhotels");
        return modelAndView;
    }

    @RequestMapping(value = "/addhotels", method = RequestMethod.POST)
    public ModelAndView addHotels(Hotel hotel, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        hotelService.addHotel(hotel);
        modelAndView.addObject("successMessage", "added successfully");
        modelAndView.setViewName("addhotels");
        return modelAndView;
    }
}
