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

}
