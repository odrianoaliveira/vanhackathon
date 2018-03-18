package com.skipthedishes.infrastructure.feign;

import com.skipthedishes.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

//@FeignClient("CATALOGMANAGEMENT") //Using eureka service discovery
@FeignClient(name="CatalogClient",url = "http://localhost:8383") //Only for local test
public interface CatalogClient {

    @RequestMapping(method = RequestMethod.GET,
            value = "/catalog/product/{productId}")
    Product retrieveProduct(@PathVariable("productId") String productId);
}
