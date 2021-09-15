package com.project2.project2spring.service;

import com.project2.project2spring.entity.Mobs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MobsService {
    Mobs saveMobs(Mobs mobs);
    List<Mobs> getAllMobs();
    Mobs deleteMobs(Long mobId);
}
