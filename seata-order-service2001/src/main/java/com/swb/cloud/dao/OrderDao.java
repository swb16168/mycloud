package com.swb.cloud.dao;

import com.swb.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 72774
 * @Description
 * @create 2021-02-23 15:38
 */
@Mapper
public interface OrderDao {
    //创建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
