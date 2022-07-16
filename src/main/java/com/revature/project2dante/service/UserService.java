package com.revature.project2dante.service;

import com.revature.project2dante.model.User;
import com.revature.project2dante.repository.UserRepository;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //Read
    //getAllUsers
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

