package com.rifal.ssdminiproject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.*;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brand_id;
    private String brandName;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Car> cars;

    public String getBrandName() {
        return brandName;
    }

    public List<Car> getCars() {
        return cars;
    }
}
