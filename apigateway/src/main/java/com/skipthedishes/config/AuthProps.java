package com.skipthedishes.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Component
@ConfigurationProperties(prefix = "auth")
@Data
public class AuthProps {
    private Map<String, Object> roles = new HashMap<>();
    private Map<String, Object> users = new HashMap<>();
}
