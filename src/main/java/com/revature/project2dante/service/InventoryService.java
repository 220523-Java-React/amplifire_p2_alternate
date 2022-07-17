package com.revature.project2dante.service;


import com.revature.project2dante.model.Inventory;
import com.revature.project2dante.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository=inventoryRepository;
    }

    //create
    public Inventory createInventory(Inventory inventory){
        return this.inventoryRepository.save(inventory);
    }

    //read
   //getAll
    public List<Inventory> getAllInventories(){
        return this.inventoryRepository.findAll();
    }

    //getById
    public Inventory getInventoryById(Long id){
        return this.inventoryRepository.findById(id).get();
    }

    //update
    public Inventory updateInventory(Long id, Inventory inventory){
        return this.inventoryRepository.save(inventory);
    }

    //delete
    public void deleteInventoryById(Long id){
        inventoryRepository.deleteById(id);
    }
}
