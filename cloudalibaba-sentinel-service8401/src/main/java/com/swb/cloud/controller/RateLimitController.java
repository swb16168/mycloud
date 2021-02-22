package com.swb.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import com.swb.cloud.sentinelHandler.SentinelGlobalBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 72774
 * @Description
 * @create 2021-02-22 10:00
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResources(){
        return  new CommonResult(CommonResult.CODE_OK,"按资源名称限流测试OK",new Payment(2021L,"serial0001"));
    }

    public CommonResult handleException(BlockException e){
        return new CommonResult(444,e.getClass().getCanonicalName()+"\t服务不可用！！");
    }


    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){
        return  new CommonResult(CommonResult.CODE_OK,"按资源URL限流测试OK",new Payment(2021L,"serial1001"));
    }



    @GetMapping("/rateLimit/byCustomer")
    @SentinelResource(value = "byCustomer" ,blockHandlerClass = SentinelGlobalBlockHandler.class,blockHandler = "handleException1")
    public CommonResult byCustomer(){
        return  new CommonResult(CommonResult.CODE_OK,"自定义全局限流处理 测试OK",new Payment(2021L,"serial1008"));
    }
    @GetMapping("/rateLimit/byCustomer1")
    @SentinelResource(value = "byCustomer1" ,blockHandlerClass = SentinelGlobalBlockHandler.class,blockHandler = "handleException2")
    public CommonResult byCustomer1(){
        return  new CommonResult(CommonResult.CODE_OK,"自定义全局限流处理 调用不同方法 测试OK",new Payment(2021L,"serial1008"));
    }
}
