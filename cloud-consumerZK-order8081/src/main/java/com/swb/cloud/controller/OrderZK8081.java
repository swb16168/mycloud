package com.swb.cloud.controller;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 72774
 * @Description
 * @create 2021-01-19 11:50
 */
@RestController
@Slf4j
public class OrderZK8081 {

    public static final String INVOkE_URL="http://cloud-provider-payment";

    public static final String PAYMENT_GETBYID= "/payment/get/";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        System.out.println("id---->" + id);
        return  restTemplate.getForObject(INVOkE_URL+PAYMENT_GETBYID + id,CommonResult.class);
    }

    @GetMapping("test/{id}")
    public CommonResult<Payment> getPayment1(@PathVariable("id") Long id){
        System.out.println("id---->" + id);
        return  restTemplate.getForObject(INVOkE_URL+PAYMENT_GETBYID + id,CommonResult.class);
    }
}
