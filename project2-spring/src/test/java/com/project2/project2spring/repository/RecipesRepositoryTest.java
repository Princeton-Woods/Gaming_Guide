package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Recipes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RecipesRepositoryTest {

    @Autowired
    private RecipesRepository repository;

    @Test
    public void saveRecipes(){
        Recipes recipe = Recipes.builder()
                .title("Axes")
                .url("assets/Images/Crafting/axes.gif")
                .description("Axes GIF")
                .build();
        repository.save(recipe);
    }

    @Test
    public void displayAllRecipes(){
        List<Recipes> recipes = repository.findAll();
        System.out.println(recipes);
    }

}