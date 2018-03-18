package com.skipthedishes.interfaces.rest;

import com.skipthedishes.application.CustomerNotFoundException;
import com.skipthedishes.application.OrderNotFoundExpetion;
import com.skipthedishes.application.OrderService;
import com.skipthedishes.model.Order;
import com.skipthedishes.model.OrderStatusPatch;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

// The Order Api

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderApi {
    private final OrderService service;

    @ApiOperation(value = "", nickname = "retriveOrderByOrderId", notes = "", tags = {"Order"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })
    @GetMapping(value = "/{orderId}")
    ResponseEntity<Order> retriveOrderByOrderId(@ApiParam(value = "the order id", required = true) @PathVariable("orderId") String orderId) {

        return service.retrive(orderId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation(value = "", nickname = "findCustomerOrders", notes = "", tags = {"Order"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })
    @GetMapping(value = "/customer/{customerId}")
    ResponseEntity<List<Order>> findCustomerOrders(@ApiParam(value = "the order id", required = true) @PathVariable("customerId") Long customerId) {

        return service.retriveCustomerOrders(customerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation(value = "", nickname = "createOrder", notes = "", tags = {"Order"})
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Created")})
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Order> createOrder(@ApiParam(value = "") @Valid @RequestBody Order order) {
        final Order created = service.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @ApiOperation(value = "", nickname = "modifyOrder", notes = "", tags = {"Order"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
    @PutMapping(value = "/{orderId}",
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Order> modifyOrder(@ApiParam(value = "") @Valid @RequestBody Order order, @PathVariable("orderId") String orderId) {

        final Optional<Order> updateOrder = service.update(orderId, order);
        return updateOrder
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation(value = "", nickname = "patchOrder", notes = "", tags = {"Order"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
    @PatchMapping(value = "/{orderId}",
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<Order> patchOrderStatus(@PathVariable("orderId") String orderId, @RequestBody OrderStatusPatch orderStatusPatch) {

            return service.patchStatus(orderStatusPatch, orderId)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }
}
