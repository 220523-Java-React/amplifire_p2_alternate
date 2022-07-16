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

        public com.revature.project2dante.model.Item setId(Long id) {
            this.id = id;
            return this;
        }

        @Column(unique = true, nullable = false)
        private String name;

        public String getName() {
            return name;
        }

        public com.revature.project2dante.model.Item setName(String name) {
            this.name = name;
            return this;
        }


        @Column(nullable = false)
        private String description;

        public String getDescription() {
            return description;
        }

        public com.revature.project2dante.model.Item setDescription(String description) {
            this.description = description;
            return this;
        }

        @Column(nullable = false)
        private Integer price;

        public Integer getPrice() {
            return price;
        }

        public com.revature.project2dante.model.Item setPrice(Integer price) {
            this.price = price;
            return this;
        }


    }
