package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "com.example") // Adjust the package as needed
public class AppConfig {
    
    @Bean
    public Product tumblerProduct(Barcode barcode) {
        return new Product("Tumbler", barcode);
    }
}