package com.swb.cloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author 72774
 * @Description
 * @create 2021-01-25 17:33
 */
@Component
@Slf4j
public class GlobaAuthenticationFilter implements GlobalFilter,Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("GlobaAuthenticationFilter---------------------->"  + new Date()) ;
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
