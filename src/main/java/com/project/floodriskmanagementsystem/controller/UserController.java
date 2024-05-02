package com.project.floodriskmanagementsystem.controller;

import com.project.floodriskmanagementsystem.model.User;
import com.project.floodriskmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> userList()
    {
        return userService.userList();
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
