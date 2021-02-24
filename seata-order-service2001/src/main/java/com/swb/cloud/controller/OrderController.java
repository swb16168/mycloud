package com.swb.cloud.controller;

import com.swb.cloud.domain.CommonResult;
import com.swb.cloud.domain.Order;
import com.swb.cloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController{
    @Resource
    private OrderService orderService;
 
 
    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {

        System.out.println("order====>" + order.toString());

        orderService.create(order);

        return new CommonResult(200,"订单创建成功");
    }
}
