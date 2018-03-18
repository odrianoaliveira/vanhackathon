package com.skipthedishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

// This is the Store Management microservice

@SpringBootApplication
@EnableEurekaClient
public class StoreManagementApplication {
    public static void main(String[] args) {
            SpringApplication.run(StoreManagementApplication .class, args);
        }
}
