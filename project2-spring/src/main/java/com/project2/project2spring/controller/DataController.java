package com.project2.project2spring.controller;

import com.project2.project2spring.entity.Enchantments;
import com.project2.project2spring.entity.Mobs;
import com.project2.project2spring.entity.Recipes;
import com.project2.project2spring.entity.User;
import com.project2.project2spring.service.EnchantmentsService;
import com.project2.project2spring.service.MobsService;
import com.project2.project2spring.service.RecipesService;
import com.project2.project2spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class DataController {

    // User Controller
    @Autowired
    private UserService provider;

    @PostMapping("/signup")
    public User signUpUser(@RequestBody User user) {
        return provider.saveUser(user);
    }

    @GetMapping("/signup")
    public List<User> fetchUsers() {
        return provider.getAllUsers();
    }



    // Recipes Controller
    @Autowired
    private RecipesService recipesService;

    @PostMapping("/recipes")
    public Recipes saveRecipe(@RequestBody Recipes recipes) {
        return recipesService.saveRecipes(recipes);
    }

    @GetMapping("/recipes")
    public List<Recipes> getRecipes(){
        return recipesService.getAllRecipes();
    }

    @DeleteMapping("/recipes/{recipeId}")
    public Recipes deleteRecipe(@PathVariable("recipeId") long recipeId){
        return recipesService.deleteRecipes(recipeId);
    }



    // Mobs Controller
    @Autowired
    private MobsService mobsService;

    @PostMapping("/mobs")
    public Mobs saveMob(@RequestBody Mobs mobs){
        return mobsService.saveMobs(mobs);
    }

    @GetMapping("/mobs")
    public List<Mobs> getMobs(){
        return mobsService.getAllMobs();
    }

    @DeleteMapping("/mobs/{mobId}")
    public Mobs deleteMob(@PathVariable("mobId") long mobId){
        return mobsService.deleteMobs(mobId);
    }



    // Enchantments Controller
    @Autowired
    private EnchantmentsService enchantmentsService;

    @PostMapping("/enchantments")
    public Enchantments saveEnchantment(@RequestBody Enchantments enchantments){
        return enchantmentsService.saveEnchantments(enchantments);
    }

    @GetMapping("/enchantments")
    public List<Enchantments> getEnchantments(){
        return enchantmentsService.getAllEnchantments();
    }

    @DeleteMapping("/enchantments/{enchantmentId}")
    public Enchantments deleteEnchantment(@PathVariable("enchantmentId") long enchantmentId){
        return enchantmentsService.deleteEnchantments(enchantmentId);
    }

}
