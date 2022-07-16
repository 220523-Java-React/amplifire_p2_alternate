package com.revature.project2dante.model;


import javax.persistence.*;

@Entity(name = "weapons")
public class Weapon {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)

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

    public Weapon setName(String name) {
        this.name = name;
        return this;
    }

    @Column (nullable = false)
    private Integer power;

    public Integer getPower() {
        return power;
    }

    public Weapon setPower(Integer power) {
        this.power = power;
        return this;
    }

    @Column (nullable = false)
    private String description;

    public String getDescription() {
        return description;
    }

    public Weapon setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column (nullable = false)
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public Weapon setPrice(Integer price) {
        this.price = price;
        return this;
    }
}
