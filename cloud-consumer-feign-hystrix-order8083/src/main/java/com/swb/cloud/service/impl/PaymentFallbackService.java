package com.swb.cloud.service.impl;

import com.swb.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author 72774
 * @Description
 * @create 2021-01-22 17:54
 */
@Service
public class PaymentFallbackService implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK  服务器出错，请稍后再试";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut 服务器出错，请稍后再试";

    }
}
