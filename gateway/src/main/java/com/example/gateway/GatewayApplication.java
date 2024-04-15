package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("authentication-service", r -> r.path("/user")
                        .uri("lb://authentication-service"))
                .build();
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/user-service/**")
//                        .uri("lb://user-service")
//                        .filters(f -> f.stripPrefix(1)) // Corrected method name here
//                        .id("user-service"))
//                .route(p -> p
//                        .path("/authentication-service/**")
//                        .uri("lb://authentication-service")
//                        .filters(f -> f.stripPrefix(1)) // Corrected method name here
//                        .id("authentication-service"))
//                .build();
//    }
}
