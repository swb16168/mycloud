package com.swb.cloud.service;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 10:58
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
   String getPaymentById(@PathVariable("id")Long id);



    @GetMapping("/payment/feign/timeout")
    public String getTimeout();
}
