package com.example.smartcity.controllers;

import com.example.smartcity.domain.Uni;
import com.example.smartcity.services.CustomUniDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;


@Controller
public class UniController {

    @Autowired
    private CustomUniDetailsService uniService;


    @RequestMapping(value = "/unis", method = RequestMethod.GET)
    public ModelAndView allUnis() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Uni> unis = uniService.allUniDetails();
        modelAndView.addObject("unis", unis);
        modelAndView.setViewName("unis");
        return modelAndView;
    }



    @RequestMapping(value = "/addunis", method = RequestMethod.GET)
    public ModelAndView unis() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addunis");
        return modelAndView;
    }

    @RequestMapping(value = "/addunis", method = RequestMethod.POST)
    public ModelAndView addUnis(Uni uni, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        uniService.addUni(uni);
        modelAndView.addObject("successMessage", "added successfully");
        modelAndView.setViewName("addunis");
        return modelAndView;
    }

}
