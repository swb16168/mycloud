package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 72774
 * @Description
 * @create 2021-01-21 11:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8082 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8082.class,args);
    }
}
