package com.swb.cloud.sentinelHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;

/**
 * @author 72774
 * @Description
 * @create 2021-02-22 10:29
 */
public class SentinelGlobalBlockHandler {
    public static CommonResult handleException1(BlockException e){
        return new CommonResult(444,"自定义全局限流处理方案---1",new Payment(2l,"serial001"));
    }
    public static String handleException2(BlockException e){
       // return new CommonResult(444,"自定义全局限流处理方案---2",new Payment(2l,"serial001"));
        return "自定义全局限流处理方案---2";

    }
}
