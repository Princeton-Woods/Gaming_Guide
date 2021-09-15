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
public class WeaponsArmor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long waId;
    private String type;
    private String url;
    private String description;
}
