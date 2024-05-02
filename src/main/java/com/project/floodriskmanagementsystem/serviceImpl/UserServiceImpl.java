package com.project.floodriskmanagementsystem.serviceImpl;

import com.project.floodriskmanagementsystem.model.User;
import com.project.floodriskmanagementsystem.repository.UserRepository;
import com.project.floodriskmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
