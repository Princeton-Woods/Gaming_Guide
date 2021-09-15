package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Mobs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MobsRepositoryTest {

    @Autowired
    private MobsRepository repository;

    @Test
    public void saveMobs(){
        Mobs mob = Mobs.builder()
                .name("")
                .url("")
                .description("")
                .build();

        repository.save(mob);
    }

    @Test
    public void displayAllMobs(){
        List<Mobs> mobs = repository.findAll();
        System.out.println(mobs);
    }

}