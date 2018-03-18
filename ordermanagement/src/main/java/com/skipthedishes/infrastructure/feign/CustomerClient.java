package com.skipthedishes.infrastructure.feign;

import com.skipthedishes.model.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

// To consume customer management microservice

//@FeignClient("CUSTOMERMANAGEMENT") //Using eureka service discovery
@FeignClient(name="CustomerClient",url = "http://localhost:8282") //Only for local test
public interface CustomerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/customer/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    Customer retrieve(@PathVariable("customerId") String customerId);
}
