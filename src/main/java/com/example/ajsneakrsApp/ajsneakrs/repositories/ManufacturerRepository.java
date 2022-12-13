package com.example.ajsneakrsApp.ajsneakrs.repositories;

import com.example.ajsneakrsApp.ajsneakrs.models.Manufacturer;
import com.example.ajsneakrsApp.ajsneakrs.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {


}
