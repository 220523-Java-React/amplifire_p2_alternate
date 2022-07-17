package com.revature.project2dante.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "item")
public class Item implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        public Integer getId() {
            return id;
        }

        public Item setId(Integer id) {
            this.id = id;
            return this;
        }

        @Column(unique = true, nullable = false)
        private String name;

        public String getName() {
            return name;
        }

        public Item setName(String name) {
            this.name = name;
            return this;
        }


        @Column(nullable = false)
        private String description;

        public String getDescription() {
            return description;
        }

        public Item setDescription(String description) {
            this.description = description;
            return this;
        }

        @Column(nullable = false)
        private Integer price;

        public Integer getPrice() {
            return price;
        }

        public Item setPrice(Integer price) {
            this.price = price;
            return this;
        }
        @Column(nullable =false)
        private boolean owned;

    public boolean isOwned() {
        return owned;
    }

    public Item setOwned(boolean owned) {
        this.owned = owned;
        return this;
    }
}
