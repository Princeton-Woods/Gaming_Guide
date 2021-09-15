package com.project2.project2spring.repository;

import com.project2.project2spring.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void saveUser(){
        User user = User.builder()
                .username("")
                .password("")
                .emailAddress("")
                .build();

        repository.save(user);
    }

    @Test
    public void displayAllUsers(){
        List<User> users = repository.findAll();
        System.out.println(users);
    }
}