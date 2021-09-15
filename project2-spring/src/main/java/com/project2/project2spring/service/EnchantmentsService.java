package com.project2.project2spring.service;

import com.project2.project2spring.entity.Enchantments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnchantmentsService {
    Enchantments saveEnchantments(Enchantments enchantments);
    List<Enchantments> getAllEnchantments();
    Enchantments deleteEnchantments(Long enchantmentId);
}
