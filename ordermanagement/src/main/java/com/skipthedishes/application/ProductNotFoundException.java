package com.skipthedishes.application;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */
public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(final String productId){
        super("the product id ["+productId+"] does not exist.");
    }
}
