package com.swb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 72774
 * @Description
 * @create 2021-01-25 11:46
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9001 {
    public static void main(String[] args) {
            SpringApplication.run(HystrixDashBoard9001.class,args);
        }
}
