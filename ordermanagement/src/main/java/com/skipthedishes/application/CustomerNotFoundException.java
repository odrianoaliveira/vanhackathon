package com.skipthedishes.application;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(final String customerId) {
        super("The customer id ["+customerId+"] does not exist.");
    }
}
