package com.revature.project2dante.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "inventory_id")
    private List<Armor> armors;

    public List<Armor> getArmors() {
        return armors;
    }

    public Inventory setArmors(List<Armor> armors) {
        this.armors = armors;
        return this;
    }
}
