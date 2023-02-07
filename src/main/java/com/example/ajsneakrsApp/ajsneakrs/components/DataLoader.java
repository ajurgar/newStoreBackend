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
        manufacturerRepository.save(manufacturer1);

        Manufacturer manufacturer2 = new Manufacturer();
        manufacturer2.setProducts(new ArrayList<>());
        manufacturer2.setName("Adidas");
        manufacturerRepository.save(manufacturer2);

        Manufacturer manufacturer3 = new Manufacturer();
        manufacturer3.setProducts(new ArrayList<>());
        manufacturer3.setName("New Balance");
        manufacturerRepository.save(manufacturer3);

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
        product2.setName("Air Jordan 3");
        product2.setDescription("Remastered 2023");
        product2.setSize(7);
        product2.setManufacturer(manufacturer1);
        product2.setStockQty(2);
        product2.setBuyPrice(200);
        product2.setSellPrice(320);
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setName("Air Jordan 1");
        product3.setDescription("Obsidian");
        product3.setSize(6);
        product3.setManufacturer(manufacturer1);
        product3.setStockQty(3);
        product3.setBuyPrice(170);
        product3.setSellPrice(280);
        productRepository.save(product3);

        Product product4 = new Product();
        product4.setName("Air Force 1");
        product4.setDescription("Triple White");
        product4.setSize(8);
        product4.setManufacturer(manufacturer1);
        product4.setStockQty(2);
        product4.setBuyPrice(120);
        product4.setSellPrice(190);
        productRepository.save(product4);

        Product product5 = new Product();
        product5.setName("Nike Cortez");
        product5.setDescription("University Blue");
        product5.setSize(7.5);
        product5.setManufacturer(manufacturer1);
        product5.setStockQty(6);
        product5.setBuyPrice(100);
        product5.setSellPrice(120);
        productRepository.save(product5);

        Product product6 = new Product();
        product6.setName("Air Jordan 11");
        product6.setDescription("Concord");
        product6.setSize(11);
        product6.setManufacturer(manufacturer1);
        product6.setStockQty(5);
        product6.setBuyPrice(150);
        product6.setSellPrice(190);
        productRepository.save(product6);


        Product product7 = new Product();
        product7.setName("Adidas Ultraboost");
        product7.setDescription("Triple Black 22");
        product7.setSize(7);
        product7.setManufacturer(manufacturer2);
        product7.setStockQty(5);
        product7.setBuyPrice(150);
        product7.setSellPrice(190);
        productRepository.save(product7);

        Product product8 = new Product();
        product8.setName("New Balance 990V3");
        product8.setDescription("Teddy Santis Marblehead");
        product8.setSize(7);
        product8.setManufacturer(manufacturer3);
        product8.setStockQty(1);
        product8.setBuyPrice(200);
        product8.setSellPrice(240);
        productRepository.save(product8);


    }
}
