package com.user.user.service;

import com.user.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    List<User> user= List.of(
            new User(1, "abhsi"),
            new User(2,"aneesh")
    );

    @Override
    public User getByName(String name) {
        return user.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
    }
}
