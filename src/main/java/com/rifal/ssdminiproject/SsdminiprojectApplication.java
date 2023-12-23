package com.rifal.ssdminiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.rifal.ssdminiproject.model")
public class SsdminiprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsdminiprojectApplication.class, args);
    }
}