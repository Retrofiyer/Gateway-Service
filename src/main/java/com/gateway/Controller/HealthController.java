package com.gateway.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Tag(name = "Api Rest for brands use Swagger 3 - Gateway")
public class HealthController {

    @GetMapping
    @Operation(summary = "This is endpoint to get information to API-GATEWAY")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.ok("Service is up and running");
    }
}
