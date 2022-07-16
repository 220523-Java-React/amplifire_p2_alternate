package com.revature.project2dante.service;

import com.revature.project2dante.model.User;
import com.revature.project2dante.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    //Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //Read
    //getAllUsers
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //getByID
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    //update
    public User updateUser(Integer userId, User user) {
        return userRepository.save(user);
    }

   //delete
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}

