package com.swb.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 72774
 * @Description
 * @create 2021-01-21 16:00
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRandomRule() {
        return new RandomRule();
    }
}
