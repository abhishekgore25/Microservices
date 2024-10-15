package com.user.user.controller;

import com.user.user.entity.Contact;
import com.user.user.entity.User;
import com.user.user.service.UserService;
import com.user.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{name}")
    public User getByName(@PathVariable("name") String name){
        User user=userService.getByName(name);
        System.out.println(user.getId());
        List contact= this.restTemplate.getForObject("http://contact-service/contact/"+user.getId(), List.class);
        user.setContactList(contact);
        return user;
    }

    @PostMapping("hii")
    public String hii()
    {
        return "hii running";
    }
}
