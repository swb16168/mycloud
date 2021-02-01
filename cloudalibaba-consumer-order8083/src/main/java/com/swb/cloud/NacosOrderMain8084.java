package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 72774
 * @Description
 * @create 2021-02-01 16:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain8084 {
    public static void main(String[] args) {
            SpringApplication.run(NacosOrderMain8084.class,args);
        }
}
