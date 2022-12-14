package com.example.ajsneakrsApp.ajsneakrs.controllers;


import com.example.ajsneakrsApp.ajsneakrs.models.Product;
import com.example.ajsneakrsApp.ajsneakrs.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    ProductRepository repo;

    @GetMapping
    List<Product> getAllProducts() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity <Optional<Product>> getProductById(@PathVariable Long id){
        return new ResponseEntity<>(repo.findById(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        return new ResponseEntity<>(repo.save(product), HttpStatus.CREATED);
    }
}
