package com.skipthedishes.vanhacsaopaulofair.interfaces.rest;

import com.skipthedishes.vanhacsaopaulofair.model.Cousine;
import com.skipthedishes.vanhacsaopaulofair.model.Customer;
import com.skipthedishes.vanhacsaopaulofair.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Api(value = "vanHackSaoPauloFairApi", description = "the VanHack Sao Paulo Fair Api")
public interface VanHackSaoPauloFairApiV1 {



    @ApiOperation(value = "", nickname = "apiV1CustomerAuthPost", notes = "", tags={ "Customer", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Customer/auth",
        method = RequestMethod.POST)
    ResponseEntity<Void> apiV1CustomerAuthPost(@ApiParam(value = "") @Valid @RequestParam(value = "email", required = false) String email, @ApiParam(value = "") @Valid @RequestParam(value = "password", required = false) String password);


    @ApiOperation(value = "", nickname = "apiV1CustomerPost", notes = "", tags={ "Customer", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Customer",
        consumes = { "application/json-patch+json", "application/json", "text/json", "application/_*+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> apiV1CustomerPost(@ApiParam(value = "") @Valid @RequestBody Customer customer);


    @ApiOperation(value = "", nickname = "apiV1OrderByOrderIdGet", notes = "", tags={ "Order", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Order/{orderId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1OrderByOrderIdGet(@ApiParam(value = "", required = true) @PathVariable("orderId") Long orderId);


    @ApiOperation(value = "", nickname = "apiV1OrderCustomerGet", notes = "", tags={ "Order", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Order/customer",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1OrderCustomerGet();


    @ApiOperation(value = "", nickname = "apiV1OrderPost", notes = "", tags={ "Order", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Order",
        consumes = { "application/json-patch+json", "application/json", "text/json", "application/_*+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> apiV1OrderPost(@ApiParam(value = "") @Valid @RequestBody Order order);


    @ApiOperation(value = "", nickname = "apiV1ProductByProductIdGet", notes = "", tags={ "Product", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Product/{productId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1ProductByProductIdGet(@ApiParam(value = "", required = true) @PathVariable("productId") Long productId);


    @ApiOperation(value = "", nickname = "apiV1ProductGet", notes = "", tags={ "Product", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Product",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1ProductGet();


    @ApiOperation(value = "", nickname = "apiV1ProductSearchBySearchTextGet", notes = "", tags={ "Product", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Product/search/{searchText}",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1ProductSearchBySearchTextGet(@ApiParam(value = "", required = true) @PathVariable("searchText") String searchText);


    @ApiOperation(value = "", nickname = "apiV1StoreByStoreIdGet", notes = "", tags={ "Store", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Store/{storeId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1StoreByStoreIdGet(@ApiParam(value = "", required = true) @PathVariable("storeId") Long storeId);


    @ApiOperation(value = "", nickname = "apiV1StoreByStoreIdProductsGet", notes = "", tags={ "Store", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Store/{storeId}/products",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1StoreByStoreIdProductsGet(@ApiParam(value = "", required = true) @PathVariable("storeId") Long storeId);


    @ApiOperation(value = "", nickname = "apiV1StoreGet", notes = "", tags={ "Store", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Store",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1StoreGet();


    @ApiOperation(value = "", nickname = "apiV1StoreSearchBySearchTextGet", notes = "", tags={ "Store", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success") })
    @RequestMapping(value = "/api/v1/Store/search/{searchText}",
        method = RequestMethod.GET)
    ResponseEntity<Void> apiV1StoreSearchBySearchTextGet(@ApiParam(value = "", required = true) @PathVariable("searchText") String searchText);

}
