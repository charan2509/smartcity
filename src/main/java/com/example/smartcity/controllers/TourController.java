package com.example.smartcity.controllers;

import com.example.smartcity.domain.Tour;
import com.example.smartcity.services.CustomTourDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class TourController {

    @Autowired
    private CustomTourDetailsService tourService;

    @RequestMapping(value = "/tours", method = RequestMethod.GET)
    public ModelAndView allTours() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Tour> tours = tourService.allTourDetails();
        modelAndView.addObject("tours", tours);
        modelAndView.setViewName("tours");
        return modelAndView;
    }



    @RequestMapping(value = "/addtours", method = RequestMethod.GET)
    public ModelAndView tours() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addtours");
        return modelAndView;
    }

    @RequestMapping(value = "/addtours", method = RequestMethod.POST)
    public ModelAndView addTours(Tour tour, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        tourService.addTour(tour);
        modelAndView.addObject("successMessage", "place added successfully");
        modelAndView.setViewName("addtours");
        return modelAndView;
    }
}
