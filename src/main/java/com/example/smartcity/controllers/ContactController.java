package com.example.smartcity.controllers;

import com.example.smartcity.domain.Contact;
import com.example.smartcity.services.CustomContactDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

@Controller
public class ContactController {
    @Autowired
    private CustomContactDetailsService contactService;

    @RequestMapping(value = "/allcontacts", method = RequestMethod.GET)
    public ModelAndView allContacts() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Contact> allcontacts = contactService.allContactDetails();
        modelAndView.addObject("allcontacts", allcontacts);
        modelAndView.setViewName("allcontacts");
        return modelAndView;
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public ModelAndView contacts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contacts");
        return modelAndView;
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public ModelAndView addContacts(Contact contact, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        contactService.addContact(contact);
        modelAndView.addObject("successMessage", "added successfully");
        modelAndView.setViewName("contacts");
        return modelAndView;
    }

}

