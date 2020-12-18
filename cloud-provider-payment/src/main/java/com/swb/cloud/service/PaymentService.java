package com.swb.cloud.service;

import com.swb.cloud.entities.Payment;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:14
 */


public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
