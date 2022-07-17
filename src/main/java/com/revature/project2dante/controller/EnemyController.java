package com.revature.project2dante.controller;


import com.revature.project2dante.model.Enemy;
import com.revature.project2dante.service.EnemyService;
import org.springframework.http.HttpStatus;
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
    public Enemy createEnemy(@RequestBody Enemy enemy) {
        return enemyService.createEnemy(enemy);
    }

    @GetMapping
    public List<Enemy> getAllEnemies() {
        return enemyService.getAllEnemies();
    }

    @GetMapping("{enemyId}")
    public Enemy getEnemyById(@PathVariable Integer enemyId){
        return enemyService.getEnemyById(enemyId);
    }

    @PatchMapping("{enemyId}")
    public Enemy updateEnemy(@PathVariable Integer enemyId, @RequestBody Enemy enemy){
        return enemyService.updateEnemy(enemyId, enemy);
    }

    @DeleteMapping("{enemyId}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteEnemyById(@PathVariable Integer enemyId){
        enemyService.deleteEnemyById(enemyId);
    }
}
