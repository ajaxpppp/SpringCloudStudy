package com.shenjun.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        //https://twitter.com/DanScavino
        RouteLocator path_route_tw = routes
                .route("path_route_tw", r -> r.path("/yxsgs")
                        .uri("http://my.4399.com/yxsgs/"))
                .build();
        return path_route_tw;
    }
}
