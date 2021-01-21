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
 * @create 2020-12-18 11:43
 */

@RestController
@Slf4j
public class OrderController {

    //public static final String BASE_URL="http://localhost:8001";

    public static final String BASE_URL="http://CLOUD-PAYMENT-SERVICE";
    public static final String PAYMENT_CREATE= "/payment/create";
    public static final String PAYMENT_GETBYID= "/payment/get/";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return  restTemplate.postForObject(BASE_URL+PAYMENT_CREATE,payment,CommonResult.class);
    }

    @GetMapping("test")
    public String test(){
        return  "test";
    }


    @GetMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        System.out.println("id---->" + id);
        return  restTemplate.getForObject(BASE_URL+PAYMENT_GETBYID + id,CommonResult.class);
    }
}
