package com.swb.cloud.service.impl;

import com.swb.cloud.dao.PaymentDao;
import com.swb.cloud.entities.Payment;
import com.swb.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
