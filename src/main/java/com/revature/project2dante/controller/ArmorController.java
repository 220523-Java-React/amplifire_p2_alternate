package com.revature.project2dante.controller;

import com.revature.project2dante.model.Armor;
import com.revature.project2dante.service.ArmorService;
import org.springframework.http.HttpStatus;
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

    @GetMapping("{armorId}")
    public Armor getArmorById(@PathVariable Integer armorId){
        return armorService.getArmorById(armorId);
    }

    @PatchMapping("{armorId}")
    public Armor updateArmor(@PathVariable Integer armorId, @RequestBody Armor armor){
        return armorService.updateArmor(armorId, armor);
    }

    @DeleteMapping("{armorId}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteArmorById(@PathVariable Integer armorId){
        armorService.deleteArmorById(armorId);
    }
}
