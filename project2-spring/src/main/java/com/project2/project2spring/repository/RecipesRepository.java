package com.project2.project2spring.repository;

import com.project2.project2spring.entity.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Long> {
}
