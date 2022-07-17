package com.revature.project2dante.controller;


import com.revature.project2dante.model.Weapon;
import com.revature.project2dante.service.WeaponService;
import org.springframework.http.HttpStatus;
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

    //updateById
    @PatchMapping("{weaponId}")
    public Weapon updateWeapon(@PathVariable Integer weaponId, @RequestBody Weapon weapon){
        return weaponService.updateWeapon(weaponId, weapon);
    }

    //delete
    @DeleteMapping("/{weaponId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteWeaponById(@PathVariable Integer weaponId){
        weaponService.deleteWeaponById(weaponId);
    }

}
