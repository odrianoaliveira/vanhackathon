package com.skipthedishes.interfaces.rest;

import com.skipthedishes.application.StoreService;
import com.skipthedishes.model.Store;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreApi {
    private final StoreService service;

    @GetMapping(value = "/{storeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Store> retrieve(@PathVariable String storeId) {
        return service.retrieve(storeId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Store> create(@ApiParam(value = "") @Valid @RequestBody Store store) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(store));
    }
}
