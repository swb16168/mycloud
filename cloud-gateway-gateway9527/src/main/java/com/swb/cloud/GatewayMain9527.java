package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 72774
 * @Description
 * @create 2021-01-25 15:02
 */
@SpringBootApplication
@EnableEurekaClient 
public class GatewayMain9527 {
    public static void main(String[] args) {
            SpringApplication.run(GatewayMain9527.class,args);
        }
}
