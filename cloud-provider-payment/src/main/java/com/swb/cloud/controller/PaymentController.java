package com.swb.cloud.controller;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import com.swb.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:15
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0 ){
            return CommonResult.ok();
        }
        return CommonResult.failed();
    }

    @GetMapping("get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){

        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return CommonResult.data(payment);
        }
        return CommonResult.failed();

    }

}
