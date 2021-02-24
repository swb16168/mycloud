package com.swb.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 72774
 * @Description
 * @create 2021-02-23 16:08
 */
@Configuration
@MapperScan(value = "com.swb.cloud.dao")
public class MyBatisConfig {
}
