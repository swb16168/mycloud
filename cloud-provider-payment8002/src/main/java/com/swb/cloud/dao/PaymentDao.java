package com.swb.cloud.dao;

import com.swb.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:13
 */
@Mapper
public interface PaymentDao {

   int create(Payment payment);

   Payment getPaymentById(@Param("id") Long id);

}
