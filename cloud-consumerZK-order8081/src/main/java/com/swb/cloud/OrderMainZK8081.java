package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 72774
 * @Description
 * @create 2021-01-19 15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZK8081 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainZK8081.class,args);
    }
}
