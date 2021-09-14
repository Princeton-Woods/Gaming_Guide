package com.revature.useraccount.service;

import com.revature.useraccount.entity.User;
import com.revature.useraccount.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
interface UserDAO {

    public User signUpUser(User user);
    public List<User> fetchUsers();
}

@Service
public class UserService implements UserDAO {

    @Autowired
    private UserRepo repo;

    @Override
    public User signUpUser(User user){
        return repo.save(user);
    }

    @Override
    public List<User> fetchUsers() {
        return repo.findAll();
    }
}