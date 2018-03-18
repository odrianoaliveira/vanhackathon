package com.skipthedishes.application;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */


public class OrderNotFoundExpetion extends RuntimeException {
    OrderNotFoundExpetion(Long orderId) {
        super("The order with id [" + orderId + "] does not exist.");
    }
}
