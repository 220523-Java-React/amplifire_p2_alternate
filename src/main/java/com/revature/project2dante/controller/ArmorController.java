package com.revature.project2dante.controller;

import com.revature.project2dante.model.Armor;
import com.revature.project2dante.service.ArmorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/armors")
public class ArmorController {
    private final ArmorService armorService;

    public ArmorController(ArmorService armorService) {
        this.armorService = armorService;
    }

    @PostMapping
    public Armor createArmor(@RequestBody Armor armor) {
        return armorService.createArmor(armor);
    }

    @GetMapping
    public List<Armor> getAllArmors() {
        return armorService.getAllArmors();
    }
}
