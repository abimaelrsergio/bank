package com.bank.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.*;
import org.springframework.cloud.gateway.route.builder.*;
import org.springframework.context.annotation.*;

import java.time.*;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

    @Bean
    public RouteLocator bankRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/bank/api/v1/accounts/**")
                        .filters(f -> f.rewritePath("/bank/api/v1/accounts(?<segment>/?.*)","/api/v1/accounts${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                        )
                        .uri("lb://ACCOUNTS")
                )
                .route(p -> p
                        .path("/bank/api/v1/loans/**")
                        .filters(f -> f.rewritePath("/bank/api/v1/loans(?<segment>/?.*)","/api/v1/loans${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                        )
                        .uri("lb://LOANS")
                )
                .route(p -> p
                        .path("/bank/api/v1/cards/**")
                        .filters(f -> f.rewritePath("/bank/api/v1/cards(?<segment>/?.*)","/api/v1/cards${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                        )
                        .uri("lb://CARDS")
                )
                .route(p -> p
                        .path("/bank/api/v1/customers/**")
                        .filters(f -> f.rewritePath("/bank/api/v1/customers(?<segment>/?.*)","/api/v1/customers${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                        )
                        .uri("lb://ACCOUNTS")
                )
                .build();
    }
}
