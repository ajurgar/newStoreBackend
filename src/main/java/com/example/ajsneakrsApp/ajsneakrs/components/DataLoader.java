package com.example.ajsneakrsApp.ajsneakrs.components;


import com.example.ajsneakrsApp.ajsneakrs.models.Manufacturer;
import com.example.ajsneakrsApp.ajsneakrs.models.Product;
import com.example.ajsneakrsApp.ajsneakrs.repositories.ManufacturerRepository;
import com.example.ajsneakrsApp.ajsneakrs.repositories.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
public class DataLoader {

    ProductRepository productRepository;
    ManufacturerRepository manufacturerRepository;

    public DataLoader(ProductRepository productRepository, ManufacturerRepository manufacturerRepository) {
        this.productRepository = productRepository;
        this.manufacturerRepository = manufacturerRepository;
    }


    @PostConstruct
    public void setup(){

        Manufacturer manufacturer1 = new Manufacturer();
        manufacturer1.setProducts(new ArrayList<>());
        manufacturer1.setName("Nike");
        manufacturer1.setStatus(true);
        manufacturerRepository.save(manufacturer1);

        Manufacturer manufacturer2 = new Manufacturer();
        manufacturer2.setProducts(new ArrayList<>());
        manufacturer2.setName("Adidas");
        manufacturer2.setStatus(true);
        manufacturerRepository.save(manufacturer2);



        Product product1 = new Product();
        product1.setName("Air Jordan 1");
        product1.setDescription("Chicago");
        product1.setSize(7);
        product1.setManufacturer(manufacturer1);
        product1.setStockQty(5);
        product1.setBuyPrice(150);
        product1.setSellPrice(190);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Adidas Forum");
        product2.setDescription("Bad Bunny White");
        product2.setSize(7.5);
        product2.setManufacturer(manufacturer2);
        product2.setStockQty(2);
        product2.setBuyPrice(140);
        product2.setSellPrice(170);
        productRepository.save(product2);
    }
}
