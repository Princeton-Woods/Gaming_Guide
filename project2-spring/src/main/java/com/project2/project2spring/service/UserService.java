package com.project2.project2spring.service;

import com.project2.project2spring.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
}
