package com.revature.project2dante.repository;

import com.revature.project2dante.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}

