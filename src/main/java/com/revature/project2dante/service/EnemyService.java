package com.revature.project2dante.service;


import com.revature.project2dante.model.Enemy;
import com.revature.project2dante.repository.EnemyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnemyService {
    private final EnemyRepository enemyRepository;


    public EnemyService(EnemyRepository enemyRepository) {
        this.enemyRepository = enemyRepository;
    }

    //create
    public Enemy createEnemy(Enemy enemy) {
        return enemyRepository.save(enemy);
    }

    //read
    public List<Enemy> getAllEnemies() {
        return enemyRepository.findAll();
    }

    public Enemy getEnemyById(Integer enemyId) {
        return enemyRepository.findById(enemyId).get();
    }

    public Enemy updateEnemy(Integer enemyId, Enemy enemy) {
        return enemyRepository.save(enemy);
    }
}
