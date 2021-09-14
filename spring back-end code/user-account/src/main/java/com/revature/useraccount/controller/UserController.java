package com.revature.useraccount.controller;

import com.revature.useraccount.entity.User;
import com.revature.useraccount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService provider;

    @PostMapping("/signup")
    public User signUpUser(@RequestBody User user) {
        return provider.signUpUser(user);
    }

    @GetMapping
    public List<User> fetchUsers() {
        return provider.fetchUsers();
    }
}