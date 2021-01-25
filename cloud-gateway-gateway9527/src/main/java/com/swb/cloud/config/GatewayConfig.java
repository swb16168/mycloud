package com.swb.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 72774
 * @Description
 * @create 2021-01-25 15:03
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_test",r ->r.path("/guonei").uri("http://news.baidu.com/guonei"));
        return routes.build();
    }

}
