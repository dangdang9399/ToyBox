package com.toybox.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.toybox"})
public class ToyBoxCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToyBoxCoreApplication.class, args);
    }
}
