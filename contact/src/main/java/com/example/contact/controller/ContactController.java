package com.example.contact.controller;

import com.example.contact.entity.Contact;
import com.example.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping("/{id}")
    public List<Contact> getContacts(@PathVariable("id") int id){
        return contactService.getContacts(id);
    }
}
