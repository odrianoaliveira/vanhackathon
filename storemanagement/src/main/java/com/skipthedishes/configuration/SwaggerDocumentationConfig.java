package com.skipthedishes.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {
    private static final String URL = "https://www.skipthedishes.com/";

    @Value("${info.application.apiVersion}")
    private String version;

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Store Management")
            .description("The SkipTheDishes Store Management API.")
            .license("")
            .licenseUrl(URL)
            .termsOfServiceUrl(URL)
            .version(version)
            .contact(new Contact("DevTeam",URL, "devteam@skipthedishes.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.skipthedishes.interfaces.rest"))
                .build()
                .apiInfo(apiInfo());
    }

}
