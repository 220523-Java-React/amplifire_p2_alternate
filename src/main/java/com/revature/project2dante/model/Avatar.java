package com.revature.project2dante.model;

import javax.persistence.*;

@Entity(name = "avatar")
public class Avatar {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(unique = true, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public Avatar setName(String name) {
        this.name = name;
        return this;
    }

    @Column(nullable = false)
    private int age;

    public int getAge() {
        return age;
    }

    public Avatar setAge(int age) {
        this.age = age;
        return this;
    }

    @Column(nullable = false)
    private int health;

    public int getHealth() {
        return health;
    }

    public Avatar setHealth(int health) {
        this.health = health;
        return this;
    }

    @Column(nullable = false)
    private int power;

    public int getPower() {
        return power;
    }

    public Avatar setPower(int power) {
        this.power = power;
        return this;
    }

    @Column(nullable = false)
    private int defense;

    public int getDefense() {
        return defense;
    }

    public Avatar setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Column(nullable = false)
    private int specialPower;

    public int getSpecialPower() {
        return specialPower;
    }

    public Avatar setSpecialPower(int specialPower) {
        this.specialPower = specialPower;
        return this;
    }

    @Column(nullable = false)
    private int specialDefense;

    public int getSpecialDefense() {
        return specialDefense;
    }

    public Avatar setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
        return this;
    }


}
