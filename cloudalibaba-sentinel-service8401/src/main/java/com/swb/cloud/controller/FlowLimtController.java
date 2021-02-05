package com.swb.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 72774
 * @Description
 * @create 2021-02-05 11:04
 */
@RestController
public class FlowLimtController {
    @GetMapping("/testA")
    public String testA() {
        System.out.println("testA####################");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        System.out.println("testB###################");
        return "------testB";
    }

    /**
     * 测试RT服务熔断
     * @return
     */
    @GetMapping("/testD")
    public String testD() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testD###################");
        return "------testD";
    }
}
