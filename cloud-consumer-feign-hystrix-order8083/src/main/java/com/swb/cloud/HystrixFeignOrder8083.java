package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 15:26
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixFeignOrder8083 {
    public static void main(String[] args) {
            SpringApplication.run(HystrixFeignOrder8083.class,args);
        }
}

