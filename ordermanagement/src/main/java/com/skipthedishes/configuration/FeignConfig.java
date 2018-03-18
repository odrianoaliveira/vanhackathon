package com.skipthedishes.configuration;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Configuration
@EnableFeignClients(basePackages = "com.skipthedishes.infrastructure.feign")
public class FeignConfig {
}
