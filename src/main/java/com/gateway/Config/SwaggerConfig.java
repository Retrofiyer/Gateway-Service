package com.gateway.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Api Rest Gateway",
                version = "1.0",
                description = "This is a api rest Gateway"
        )
)
public class SwaggerConfig {
}
