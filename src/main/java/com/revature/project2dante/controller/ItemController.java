package com.revature.project2dante.controller;


import com.revature.project2dante.model.Item;
import com.revature.project2dante.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService=itemService;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    //findItemById
    @GetMapping("{itemId}")
    public Item getItemById(@PathVariable Integer itemId){
        return itemService.getItemById(itemId);
    }

    //updateById
    @PatchMapping("{itemId}")
    public Item updateItem(@PathVariable Integer itemId, @RequestBody Item item){
        return itemService.updateItem(itemId, item);
    }

    //delete
    @DeleteMapping("/{itemId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteItemById(@PathVariable Integer itemId){
        itemService.deleteItemById(itemId);
    }


}
