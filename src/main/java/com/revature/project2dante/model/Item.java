package com.revature.project2dante.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "item")
public class Item implements Serializable {



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        public Long getId() {
            return id;
        }

        public Item setId(Long id) {
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


    }
