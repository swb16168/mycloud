package com.swb.cloud.controller;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import com.swb.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 11:10
 */
@RestController
@Slf4j
public class PaymentFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;


    @GetMapping(value = "/consumer/payment/get/{id}")
    public String getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("consumer/feign/timeout")
    public String getTimeout(){
       return "consumer------>" + paymentFeignService.getTimeout();
    }

}
