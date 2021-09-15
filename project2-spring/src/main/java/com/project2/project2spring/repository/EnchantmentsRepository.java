package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Enchantments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnchantmentsRepository extends JpaRepository<Enchantments, Long> {
}
