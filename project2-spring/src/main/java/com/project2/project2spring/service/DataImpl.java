package com.project2.project2spring.service;

import com.project2.project2spring.entity.*;
import com.project2.project2spring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataImpl implements RecipesService, MobsService, EnchantmentsService, UserService, WeaponsArmorService {



    //Recipes Service
    @Autowired
    private RecipesRepository recipesRepository;

    @Override
    public Recipes saveRecipes(Recipes recipes) {
        return recipesRepository.save(recipes);
    }

    @Override
    public List<Recipes> getAllRecipes() {
        return recipesRepository.findAll();
    }

    @Override
    public Recipes deleteRecipes(Long recipeId) {
        Recipes recipesDB = recipesRepository.findById(recipeId).get();
        recipesRepository.delete(recipesDB);
        return recipesDB;
    }



    //Mobs Service
    @Autowired
    private MobsRepository mobsRepository;

    @Override
    public Mobs saveMobs(Mobs mobs) {
        return mobsRepository.save(mobs);
    }

    @Override
    public List<Mobs> getAllMobs() {
        return mobsRepository.findAll();
    }

    @Override
    public Mobs deleteMobs(Long mobId) {
        Mobs mobsDB = mobsRepository.findById(mobId).get();
        mobsRepository.delete(mobsDB);
        return mobsDB;
    }



    //WeaponsArmor Service
    @Autowired
    private WeaponsArmorRepository weaponsArmorRepository;

    @Override
    public WeaponsArmor saveWeaponsArmor(WeaponsArmor weaponsArmor) {
        return weaponsArmorRepository.save(weaponsArmor);
    }

    @Override
    public List<WeaponsArmor> getAllWeaponsArmor() {
        return weaponsArmorRepository.findAll();
    }

    @Override
    public WeaponsArmor deleteWeaponsArmor(Long waId) {
        WeaponsArmor weaponsArmorDB = weaponsArmorRepository.findById(waId).get();
        weaponsArmorRepository.delete(weaponsArmorDB);
        return weaponsArmorDB;
    }



    //Enchantments Service
    @Autowired
    private EnchantmentsRepository enchantmentsRepository;

    @Override
    public Enchantments saveEnchantments(Enchantments enchantments) {
        return enchantmentsRepository.save(enchantments);
    }

    @Override
    public List<Enchantments> getAllEnchantments() {
        return enchantmentsRepository.findAll();
    }

    @Override
    public Enchantments deleteEnchantments(Long enchantmentId) {
        Enchantments enchantmentsDB = enchantmentsRepository.findById(enchantmentId).get();
        enchantmentsRepository.delete(enchantmentsDB);
        return enchantmentsDB;
    }


    //User Service
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
