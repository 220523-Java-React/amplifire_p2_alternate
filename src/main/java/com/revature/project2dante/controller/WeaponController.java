package com.revature.project2dante.controller;


import com.revature.project2dante.model.Weapon;
import com.revature.project2dante.service.WeaponService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weapons")
public class WeaponController {
    private final WeaponService weaponService;


    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @PostMapping
    public Weapon createWeapon(@RequestBody Weapon weapon){
        return weaponService.createWeapon(weapon);
    }

    @GetMapping
    public List<Weapon> getAllWeapons(){
        return weaponService.getAllWeapons();
    }

    //getUserById
    @GetMapping("{weaponId}")
    public Weapon getWeaponById(@PathVariable Integer weaponId){
        return weaponService.getWeaponById(weaponId);
    }
}
