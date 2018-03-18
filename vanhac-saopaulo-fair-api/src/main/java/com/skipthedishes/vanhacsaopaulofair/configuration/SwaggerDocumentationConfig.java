package com.skipthedishes.vanhacsaopaulofair.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@Configuration
public class SwaggerDocumentationConfig {

    @Value("${info.application.apiVersion}")
    private String version;

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("vanhack-saopaulo-fair-api")
            .description("REACT and MOBILE Developers: use this API to access the end-points during your Challenge. JAVA Developers: this API must be implemented at least as is.")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("http://www.vanhack.com")
            .version(version)
            .contact(new Contact("","", ""))
            .build();
    }

//    @Bean
//    public Docket customImplementation(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
//                    .build()
//                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
//                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
//                .apiInfo(apiInfo());
//    }

}
