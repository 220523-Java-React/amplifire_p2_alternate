package com.revature.project2dante.repository;

import com.revature.project2dante.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}

