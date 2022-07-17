package com.revature.project2dante.service;


import com.revature.project2dante.model.Armor;
import com.revature.project2dante.repository.ArmorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorService {
    private final ArmorRepository armorRepository;

    public ArmorService(ArmorRepository armorRepository) {this.armorRepository = armorRepository;}

    //create
    public Armor createArmor(Armor armor) {
        return armorRepository.save(armor);
    }

    //Get
    public List<Armor> getAllArmors() {
        return armorRepository.findAll();
    }

    //getById
    public Armor getArmorById(Integer id){
        return armorRepository.findById(id).get();
    }

    //update
    public Armor updateArmor(Integer armorId, Armor armor){
        return armorRepository.save(armor);
    }

    //delete
    public void deleteArmorById(int id){
        armorRepository.deleteById(id);
    }
}
