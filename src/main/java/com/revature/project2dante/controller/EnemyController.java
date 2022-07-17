package com.revature.project2dante.controller;


import com.revature.project2dante.model.Enemy;
import com.revature.project2dante.service.EnemyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enemies")
public class EnemyController {

    private final EnemyService enemyService;


    public EnemyController(EnemyService enemyService) {
        this.enemyService = enemyService;
    }

    @PostMapping
    public void createEnemy(@RequestBody Enemy enemy) {
        enemyService.createEnemy(enemy);
    }

    @GetMapping
    public List<Enemy> getAllEnemies() {
        return enemyService.getAllEnemies();
    }

    //getUserById
    @GetMapping("{enemyId}")
    public Enemy getEnemyById(@PathVariable Integer enemyId) {
        return enemyService.getEnemyById(enemyId);
    }

    //updateById
    @PatchMapping("{enemyId}")
    public Enemy updateEnemy(@PathVariable Integer enemyId, @RequestBody Enemy enemy) {
        return enemyService.updateEnemy(enemyId, enemy);
    }

}
