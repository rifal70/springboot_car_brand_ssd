package com.rifal.ssdminiproject.repository;

import com.rifal.ssdminiproject.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrandBrandName(String brandName);
}