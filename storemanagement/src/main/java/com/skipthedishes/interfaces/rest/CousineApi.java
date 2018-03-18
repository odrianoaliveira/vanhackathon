package com.skipthedishes.interfaces.rest;

import com.skipthedishes.application.CousineService;
import com.skipthedishes.application.StoreService;
import com.skipthedishes.model.Cousine;
import com.skipthedishes.model.Store;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
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
@RequestMapping("/cousine")
@RequiredArgsConstructor
public class CousineApi {
    private final CousineService service;

    @GetMapping(value = "/{cousineId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cousine> retrieve(@PathVariable String cousineId) {
        return service.retrieve(cousineId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/search/{searchText}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cousine>> search(@PathVariable String searchText) {
        return service.search(searchText)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cousine> create(@ApiParam(value = "") @Valid @RequestBody Cousine cousine) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(cousine));
    }
}
