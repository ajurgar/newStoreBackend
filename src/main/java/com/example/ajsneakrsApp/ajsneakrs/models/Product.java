package com.example.ajsneakrsApp.ajsneakrs.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //to persist the data to the database
@Data //to have access to getter and setter
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int size;
    private int stockQty;
    private int buyPrice;
    private int sellPrice;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false)
    @JsonIgnoreProperties({"products"})
    private Manufacturer manufacturer;

}
