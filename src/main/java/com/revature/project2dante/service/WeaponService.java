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

    //getById
    public Weapon getWeaponById(Integer id) {
        return weaponRepository.findById(id).get();
    }

    //update
    public Weapon updateWeapon(Integer weaponId, Weapon weapon){
        return weaponRepository.save(weapon);
    }

    //delete
    public void deleteWeaponById(int id){
        weaponRepository.deleteById(id);
    }
}
