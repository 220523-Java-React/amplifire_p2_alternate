package com.revature.project2dante.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "inventory")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public Inventory setId(Long id) {
        this.id = id;
        return this;
    }

//    ************* Foreign Keys *****************
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "armor_id")
private Armor armor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_id")
    private Weapon weapon;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;


}
