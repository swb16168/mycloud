package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 72774
 * @Description
 * @create 2021-02-23 15:31
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)  //排除数据源的自动装配
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain2001 {
    public static void main(String[] args) {
            SpringApplication.run(OrderMain2001.class,args);
        }
}
