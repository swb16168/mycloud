package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 72774
 * @Description
 * @create 2021-02-22 11:43
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain84 {
    public static void main(String[] args) {
            SpringApplication.run(OrderMain84.class,args);
        }
}
