package com.swb.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 11:53
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 配置feign最全的日志输出类
     * @return
     */
    @Bean
    Logger.Level getLever(){
        return  Logger.Level.FULL;
    }
}
