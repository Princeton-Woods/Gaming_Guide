package com.project2.project2spring.repository;

import com.project2.project2spring.entity.WeaponsArmor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeaponsArmorRepositoryTest {

    @Autowired
    private WeaponsArmorRepository repository;

    @Test
    public void saveWeaponsArmor(){
        WeaponsArmor weaponsArmor = WeaponsArmor.builder()
                .type("")
                .url("")
                .description("")
                .build();

        repository.save(weaponsArmor);
    }

    @Test
    public void displayAllWeaponsArmor(){
        List<WeaponsArmor> weaponsArmors = repository.findAll();
        System.out.println(weaponsArmors);
    }


}