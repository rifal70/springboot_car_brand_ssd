package com.rifal.ssdminiproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;
    private String carName;
    
    public String getCarName() {
        return carName;
    }

    @ManyToOne
    @JoinColumn(name = "brand_id")
    @JsonBackReference
    private Brand brand;

    public String getBrandName() {
        return brand != null ? brand.getBrandName() : null;
    }


}
