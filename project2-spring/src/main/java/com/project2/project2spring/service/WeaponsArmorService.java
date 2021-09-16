package com.project2.project2spring.service;

import com.project2.project2spring.entity.WeaponsArmor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WeaponsArmorService {
    WeaponsArmor saveWeaponsArmor(WeaponsArmor weaponsArmor);
    List<WeaponsArmor> getAllWeaponsArmor();
    WeaponsArmor deleteWeaponsArmor(Long waId);
}
