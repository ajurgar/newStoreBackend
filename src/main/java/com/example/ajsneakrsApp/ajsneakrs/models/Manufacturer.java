package com.example.ajsneakrsApp.ajsneakrs.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Manufacturer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private Boolean status;
        @JsonIgnoreProperties({"manufacturer"})
        @OneToMany(mappedBy = "manufacturer")
        @OnDelete(action = OnDeleteAction.CASCADE)
        private List<Product> products;
}
