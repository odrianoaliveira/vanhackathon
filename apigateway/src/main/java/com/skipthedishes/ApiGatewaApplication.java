package com.skipthedishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created on 17/03/18.
 *
 * @author Adriano Oliveira
 */

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaApplication.class, args);
	}
}
