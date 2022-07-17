package com.revature.project2dante.repository;

import com.revature.project2dante.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findAllByOwnedTrue();
}

