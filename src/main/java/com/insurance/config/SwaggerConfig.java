package com.insurance.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Insurance REST API")
                .version("1.0")
                .description("API documentation for the Insurance project")
                .contact(new Contact()
                    .name("Fahmida Alam-Senior Software / Backend Developer")
                    .email("your-email@example.com")
                )
            );
    }
}
