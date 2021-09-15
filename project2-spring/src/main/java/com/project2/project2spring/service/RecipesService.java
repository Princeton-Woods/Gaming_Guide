package com.project2.project2spring.service;

import com.project2.project2spring.entity.Enchantments;
import com.project2.project2spring.entity.Mobs;
import com.project2.project2spring.entity.Recipes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipesService {
    Recipes saveRecipes(Recipes recipes);
    List<Recipes> getAllRecipes();
    Recipes deleteRecipes(Long recipeId);

}
