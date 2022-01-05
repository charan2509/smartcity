package com.example.smartcity.services;

import com.example.smartcity.domain.Contact;
import com.example.smartcity.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomContactDetailsService {
    @Autowired
    private ContactRepository contactRepository;

    public Iterable<Contact> allContactDetails() {
        return contactRepository.findAll();
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
