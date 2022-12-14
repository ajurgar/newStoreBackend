package com.example.ajsneakrsApp.ajsneakrs.controllers;


import com.example.ajsneakrsApp.ajsneakrs.models.Manufacturer;
import com.example.ajsneakrsApp.ajsneakrs.models.Product;
import com.example.ajsneakrsApp.ajsneakrs.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manufacturers")

public class ManufacturerController {

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @GetMapping
    List<Manufacturer> getManufacturers(){
        return manufacturerRepository.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Manufacturer>> getManufacturerById(@PathVariable Long id){
        return new ResponseEntity<>(manufacturerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Manufacturer> addNewManufacturer(@RequestBody Manufacturer manufacturer){
        return new ResponseEntity<>(manufacturerRepository.save(manufacturer), HttpStatus.CREATED);
    }
}
