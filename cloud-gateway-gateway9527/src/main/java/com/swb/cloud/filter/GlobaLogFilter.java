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
 * @create 2021-01-25 17:29
 */
@Component
@Slf4j
public class GlobaLogFilter implements GlobalFilter,Ordered{

    //对于请求的过滤
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // ServerWebExchange exchange  请求对象

        log.info(new Date() + "GlobaLogFilter-------->"  + exchange.getRequest().toString());

        return chain.filter(exchange);
    }


    //标识此过滤器的优先级  数字越低优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}
