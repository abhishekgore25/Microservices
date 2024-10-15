package com.user.user.service;

import com.user.user.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User getByName(String name);
}
