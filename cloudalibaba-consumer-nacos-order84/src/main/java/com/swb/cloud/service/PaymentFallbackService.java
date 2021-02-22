package com.swb.cloud.service;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 72774
 * @Description
 * @create 2021-02-22 15:24
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
