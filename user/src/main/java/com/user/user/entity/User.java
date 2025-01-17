package com.user.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    public List<Contact> contactList = new ArrayList<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, List<Contact> contactList) {
        this.id = id;
        this.name = name;
        this.contactList = contactList;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
