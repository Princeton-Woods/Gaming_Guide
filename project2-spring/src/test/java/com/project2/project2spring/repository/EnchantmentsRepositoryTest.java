package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Enchantments;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnchantmentsRepositoryTest {

    @Autowired
    private EnchantmentsRepository repository;

    @Test
    public void saveEnchantments(){
        Enchantments enchantment = Enchantments.builder()
                .type("")
                .url("")
                .description("")
                .build();

        repository.save(enchantment);
    }

    @Test
    public void displayAllEnchantments(){
        List<Enchantments> enchantments = repository.findAll();
        System.out.println(enchantments);
    }

}