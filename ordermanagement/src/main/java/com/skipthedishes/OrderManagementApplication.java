package com.skipthedishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

// This is the OrderManagement microservice

@SpringBootApplication
public class OrderManagementApplication {
    public static void main(String[] args) {
            SpringApplication.run(OrderManagementApplication.class, args);
        }
}
