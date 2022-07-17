package com.revature.project2dante.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "armor")
public class Armor implements Serializable {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public Armor setId(Integer id) {
        this.id = id;
        return this;
    }
    @Column(unique = true, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public Armor setName(String name) {
        this.name = name;
        return this;
    }

    @Column (nullable = false)
    private Integer defense;

    public Integer getDefense() {
        return defense;
    }

    public Armor setDefense(Integer defense) {
        this.defense = defense;
        return this;
    }

    @Column (nullable = false)
    private String description;

    public String getDescription() {
        return description;
    }

    public Armor setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column (nullable = false)
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public Armor setPrice(Integer price) {
        this.price = price;
        return this;
    }



}
