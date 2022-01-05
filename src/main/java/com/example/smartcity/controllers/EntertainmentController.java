package com.example.smartcity.controllers;

import com.example.smartcity.domain.Entertainment;
import com.example.smartcity.services.CustomEntertainmentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class EntertainmentController {
    

    @Autowired
    private CustomEntertainmentDetailsService entertainmentService;


    @RequestMapping(value = "/entertainments", method = RequestMethod.GET)
    public ModelAndView allEntertainments() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Entertainment> entertainments = entertainmentService.allEntertainmentDetails();
        modelAndView.addObject("entertainments", entertainments);
        modelAndView.setViewName("entertainments");
        return modelAndView;
    }

    @RequestMapping(value = "/addentertainments", method = RequestMethod.GET)
    public ModelAndView entertainments() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addentertainments");
        return modelAndView;
    }

    @RequestMapping(value = "/addentertainments", method = RequestMethod.POST)
    public ModelAndView addEntertainments(Entertainment entertainment, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        entertainmentService.addEntertainment(entertainment);
        modelAndView.addObject("successMessage", "added successfully");
        modelAndView.setViewName("addentertainments");
        return modelAndView;
    }
}
