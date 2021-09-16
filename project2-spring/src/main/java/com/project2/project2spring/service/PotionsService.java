package com.project2.project2spring.service;

import com.project2.project2spring.entity.Potions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PotionsService {
    Potions savePotions(Potions potions);
    List<Potions> getAllPotions();
    Potions deletePotions(Long potionId);
}
