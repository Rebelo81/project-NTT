package com.nttdata.api_gateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GatewayHeaderFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerWebExchange mutatedExchange = exchange.mutate()
            .request(builder -> builder.header("X-GATEWAY-KEY", "segredo-super-seguro"))
            .build();
        return chain.filter(mutatedExchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
} 