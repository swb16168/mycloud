package com.swb.cloud.controller;

import com.swb.cloud.entities.CommonResult;
import com.swb.cloud.entities.Payment;
import com.swb.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author 72774
 * @Description
 * @create 2020-12-18 11:15
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("test")
    public String test(){
        return  "test";
    }

    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0 ){
            return CommonResult.data("提供服务的端口：" + serverPort);
        }
        return CommonResult.failed();
    }

    @GetMapping("get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){

        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return CommonResult.data(payment+"提供服务的端口：" + serverPort);
        }
        return CommonResult.failed();

    }

    @GetMapping(value = "/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }


    @GetMapping("mylb")
    public String getLbPort(){
        return serverPort+"---" + UUID.randomUUID();
    }



}
