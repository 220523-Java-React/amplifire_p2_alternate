package com.revature.project2dante.service;

import com.revature.project2dante.model.Weapon;
import com.revature.project2dante.repository.WeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeaponService {
    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    //create
    public Weapon createWeapon(Weapon weapon) {
        return weaponRepository.save(weapon);
    }

    //read
    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }

    public Weapon getWeaponById(Integer weaponId) {
        return weaponRepository.findById(weaponId).get();
    }
}
