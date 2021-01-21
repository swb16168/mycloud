package com.swb.cloud.controller;

import com.swb.cloud.mylbload.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 72774
 * @Description
 * @create 2021-01-21 18:12
 */
@RestController
@Slf4j
public class LBController {
public static final String INSTANCE_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private LoadBalancer myLb;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/mylb")
    public String getMylb(){
        System.out.println("consumer/payment/mylb");
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0){
            return "未获取到服务实例";
        }
        ServiceInstance serviceInstance = myLb.instances(instances);
        System.out.println("serviceInstance.getUri()" +serviceInstance.getUri().toString());
        return restTemplate.getForObject(serviceInstance.getUri() + "/payment/mylb", String.class);
    }



}
