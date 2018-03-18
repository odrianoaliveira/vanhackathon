package com.skipthedishes.interfaces.rest;

import com.skipthedishes.application.ProductService;
import com.skipthedishes.model.Product;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@RestController
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class CatalogApi {
    private final ProductService service;

    @GetMapping(value = "/product/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> retrieve(@PathVariable String productId) {
        return service.retrieve(productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping(value = "/product", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> create(@ApiParam(value = "") @Valid @RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(product));
    }
}
