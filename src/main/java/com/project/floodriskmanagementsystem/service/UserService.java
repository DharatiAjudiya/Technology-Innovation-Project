package com.project.floodriskmanagementsystem.service;

import com.project.floodriskmanagementsystem.model.User;

import java.util.List;

public interface UserService {
    List<User> userList();
    User addUser(User user);
}
