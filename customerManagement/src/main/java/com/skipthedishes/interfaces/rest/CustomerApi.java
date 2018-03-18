package com.skipthedishes.interfaces.rest;

import com.skipthedishes.application.CustomerService;
import com.skipthedishes.model.Customer;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */


@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerApi {
    private final CustomerService service;

    @GetMapping(value = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> retrieve(@PathVariable String customerId) {

        return service.retrieve(customerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> create(@ApiParam(value = "") @Valid @RequestBody Customer customer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(customer));
    }
}
