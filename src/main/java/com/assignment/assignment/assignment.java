package com.assignment.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class assignment {

    @GetMapping("/A_Products/{productId}")
    public String getProductDetails(@PathVariable int productId) {
        if (productId == 1) {
            return "This is detail for ID: " + productId + "\nProduct Name: Apple";
        } else if (productId == 2) {
            return "This is detail for ID: " + productId + "\nProduct Name: Banana";
        } else if (productId == 3) {
            return "This is detail for ID: " + productId + "\nProduct Name: Carrot";
        } else {
            return "No product found";
        }
    }
}

// sh ./mvnw spring-boot:run