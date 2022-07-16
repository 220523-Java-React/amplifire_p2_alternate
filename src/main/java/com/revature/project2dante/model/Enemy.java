package com.revature.project2dante.model;

import javax.persistence.*;

@Entity(name = "enemies")
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public Enemy setId(Long id) {
         this.id = id;
            return this;
    }

    //name
    @Column(unique = true, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public Enemy setName(String name) {
        this.name = name;
        return this;
    }

    //health
    @Column(nullable = false)
    private int health;

    //power
    @Column(nullable = false)
    private int power;

    //specialPower
    @Column(nullable = false)
    private String specialPower;
    //defense

    @Column(nullable = false)
    private int defense;

    //specialDefense
    @Column(nullable = false)
    private String specialDefense;
    //description

    @Column(nullable = false)
    private String description;

    public String getSpecialPower() {
        return specialPower;
    }

    public Enemy setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
        return this;
    }

    public String getSpecialDefense() {
        return specialDefense;
    }

    public Enemy setSpecialDefense(String specialDefense) {
        this.specialDefense = specialDefense;
        return this;
    }

    //gold
    @Column(nullable = false)
    private int gold;

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getPower() {
        return power;
    }

    public Enemy setPower(int power) {
        this.power = power;
        return this;
    }

    public int getDefense() {
        return defense;
    }

    public Enemy setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Enemy setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getGold() {
        return gold;
    }


    public Enemy setGold(int gold) {
        this.gold = gold;
        return this;
    }


}
