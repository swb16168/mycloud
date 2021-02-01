package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 72774
 * @Description
 * @create 2021-02-01 15:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9001 {
    public static void main(String[] args) {
            SpringApplication.run(NacosPaymentMain9001.class,args);
        }

}
