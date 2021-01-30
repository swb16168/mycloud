package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 72774
 * @Description
 * @create 2021-01-30 10:48
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8801 {

    public static void main(String[] args) {
            SpringApplication.run(StreamMain8801.class,args);
        }

}
