package com.project2.project2spring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Potions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int potionId;
    private String name;
    private String url;
    private String description;
}
