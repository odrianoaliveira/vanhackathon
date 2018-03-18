package com.skipthedishes.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Configuration
@EnableMongoRepositories(basePackages="com.skipthedishes.infrastructure.persistence")
@EnableMongoAuditing
public class MongoDBConfig {
}
