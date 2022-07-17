package com.revature.project2dante.controller;
import com.revature.project2dante.model.User;
import com.revature.project2dante.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") //react default url
@RestController
@RequestMapping("/users")

public class UserController {




    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
        }

        //findUserById
        @GetMapping("{userId}")
        public User getUserById(@PathVariable Integer userId){
            return userService.getUserById(userId);
        }




    //updateById
    @PatchMapping("{userId}")
    public User updateUser(@PathVariable Integer userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }


    //delete
    @DeleteMapping("/{userId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUserById(@PathVariable Integer userId){
        userService.deleteUserById(userId);
    }



}
