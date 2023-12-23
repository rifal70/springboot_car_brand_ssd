package com.rifal.ssdminiproject.controller;

import com.rifal.ssdminiproject.model.Car;
import com.rifal.ssdminiproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getCars(@RequestParam(required = false) String brandName) {
        if (brandName != null) {
            return carRepository.findByBrandBrandName(brandName);
        } else {
            return carRepository.findAll();
        }
    }
}