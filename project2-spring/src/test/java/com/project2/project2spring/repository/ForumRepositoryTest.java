package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Forum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ForumRepositoryTest {

    @Autowired
    private ForumRepository repository;

    @Test
    public void saveForum(){
        Forum forum = Forum.builder()
                .username("")
                .dateTime(new Date())
                .text("")
                .build();

        repository.save(forum);
    }

    @Test
    public void displayAllForums(){
        List<Forum> forums = repository.findAll();
        System.out.println(forums);
    }

}