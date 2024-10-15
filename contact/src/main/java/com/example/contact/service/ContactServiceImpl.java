package com.example.contact.service;

import com.example.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contacts = List.of(new Contact(1, 22432, 1), new Contact(2,637363, 1));

    @Override
    public List<Contact> getContacts(int id) {
        return contacts.stream().filter(contact -> contact.userid==1).toList();
    }
}
