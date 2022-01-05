package com.example.smartcity.controllers;

import com.example.smartcity.domain.Job;
import com.example.smartcity.services.CustomJobDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class JobController {
    
    @Autowired
    private CustomJobDetailsService jobService;

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public ModelAndView allJobs() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Job> jobs = jobService.allJobDetails();
        modelAndView.addObject("jobs", jobs);
        modelAndView.setViewName("jobs");
        return modelAndView;
    }

    @RequestMapping(value = "/addjobs", method = RequestMethod.GET)
    public ModelAndView jobs() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addjobs");
        return modelAndView;
    }

    @RequestMapping(value = "/addjobs", method = RequestMethod.POST)
    public ModelAndView addJobs(Job job, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        jobService.addJob(job);
        modelAndView.addObject("successMessage", "job added successfully");
        modelAndView.setViewName("addjobs");
        return modelAndView;
    }
}
