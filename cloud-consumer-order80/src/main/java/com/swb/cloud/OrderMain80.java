package com.swb.cloud;

import cn.hutool.db.dialect.impl.MysqlDialect;
import com.swb.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import sun.misc.Unsafe;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:31
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        //Unsafe
        SpringApplication.run(OrderMain80.class,args);
    }
}
