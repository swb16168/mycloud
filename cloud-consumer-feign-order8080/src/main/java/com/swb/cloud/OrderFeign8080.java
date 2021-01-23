package com.swb.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 10:54
 */

@SpringBootApplication
@EnableFeignClients
public class OrderFeign8080 {

    public static void main(String[] args) {
            SpringApplication.run(OrderFeign8080.class,args);
        }



}
