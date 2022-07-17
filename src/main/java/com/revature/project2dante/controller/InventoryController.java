package com.revature.project2dante.controller;

import com.revature.project2dante.model.Inventory;
import com.revature.project2dante.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService=inventoryService;
    }

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory){
        return inventoryService.createInventory(inventory);
    }

    //getAll
    @GetMapping
    public List<Inventory> getAllInventories(){
        return inventoryService.getAllInventories();
    }

    //getById
    @GetMapping("{inventoryId}")
    public Inventory getInventoryById(Long id){
        return inventoryService.getInventoryById(id);
    }

    @PatchMapping("{inventoryId}")
    public Inventory updateInventory(@PathVariable Long inventoryId, @RequestBody Inventory inventory){
        return inventoryService.updateInventory(inventoryId, inventory);
    }

    @DeleteMapping("{inventoryId}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteInventoryById(@PathVariable Long inventoryId){
        inventoryService.deleteInventoryById(inventoryId);
    }
}
