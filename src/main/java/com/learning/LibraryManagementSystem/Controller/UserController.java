package com.learning.LibraryManagementSystem.Controller;

import com.learning.LibraryManagementSystem.Entity.User;
import com.learning.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}