package com.example.smartcity.controllers;

import com.example.smartcity.domain.Hospital;
import com.example.smartcity.services.CustomHospitalDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class HospitalController {
    @Autowired
    private CustomHospitalDetailsService hospitalService;


    @RequestMapping(value = "/hospitals", method = RequestMethod.GET)
    public ModelAndView allHospitals() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Hospital> hospitals = hospitalService.allHospitalDetails();
        modelAndView.addObject("hospitals", hospitals);
        modelAndView.setViewName("hospitals");
        return modelAndView;
        
    }

    @RequestMapping(value = "/addhospitals", method = RequestMethod.GET)
    public ModelAndView hospitals() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addhospitals");
        return modelAndView;
    }

    @RequestMapping(value = "/addhospitals", method = RequestMethod.POST)
    public ModelAndView addHospitals(Hospital hospital, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        hospitalService.addHospital(hospital);
        modelAndView.addObject("successMessage", "added successfully");
        modelAndView.setViewName("addhospitals");
        return modelAndView;
    }
}
