package com.swb.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:42
 */
@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced  //开启轮询获取服务    //2021年1月21日 自己的轮询获取 注释此注解
    public RestTemplate  getRestTemplate(){
        return new RestTemplate();
    }
}
