package com.skipthedishes.vanhacsaopaulofair.interfaces.rest;


import com.skipthedishes.vanhacsaopaulofair.model.Customer;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class VanHackSaoPauloFairApiController implements VanHackSaoPauloFairApiV1 {

    public ResponseEntity<Void> getCousineByCousineIdStoresGet(@ApiParam(value = "",required=true) @PathVariable("cousineId") Long cousineId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1CousineGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1CousineSearchBySearchTextGet(@ApiParam(value = "",required=true) @PathVariable("searchText") String searchText) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1CustomerAuthPost(@ApiParam(value = "") @Valid @RequestParam(value = "email", required = false) String email, @ApiParam(value = "") @Valid @RequestParam(value = "password", required = false) String password) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1CustomerPost(@ApiParam(value = ""  )  @Valid @RequestBody Customer customer) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1OrderByOrderIdGet(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1OrderCustomerGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1OrderPost(@ApiParam(value = ""  )  @Valid @RequestBody Order order) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1ProductByProductIdGet(@ApiParam(value = "",required=true) @PathVariable("productId") Long productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1ProductGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1ProductSearchBySearchTextGet(@ApiParam(value = "",required=true) @PathVariable("searchText") String searchText) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1StoreByStoreIdGet(@ApiParam(value = "",required=true) @PathVariable("storeId") Long storeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1StoreByStoreIdProductsGet(@ApiParam(value = "",required=true) @PathVariable("storeId") Long storeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1StoreGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiV1StoreSearchBySearchTextGet(@ApiParam(value = "",required=true) @PathVariable("searchText") String searchText) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
