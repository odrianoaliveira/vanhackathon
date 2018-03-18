package com.skipthedishes.interfaces.rest;

import com.skipthedishes.model.Order;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

// The Order Api

@RestController
@RequestMapping("/order")
public class OrderApi {

    @ApiOperation(value = "", nickname = "retriveOrderByOrderId", notes = "", tags = {"Order"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success")})
    @GetMapping(value = "/{orderId}")
    ResponseEntity<Order> retriveOrderByOrderId(@ApiParam(value = "the order id", required = true) @PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "", nickname = "findCustomerOrders", notes = "", tags = {"Order"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success")})
    @GetMapping(value = "/customer")
    ResponseEntity<List<Order>> findCustomerOrders() {
        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "", nickname = "createOrder", notes = "", tags = {"Order"})
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Created")})
    @PostMapping(value = "/",
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> createOrder(@ApiParam(value = "") @Valid @RequestBody Order order) {
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "", nickname = "modifyOrder", notes = "", tags = {"Order"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
    @PutMapping(value = "/{orderId}",
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Void> modifyOrder(@ApiParam(value = "") @Valid @RequestBody Order order,@PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok().build();
    }
}
