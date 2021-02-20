package com.swb.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
     * 测试RT服务熔断  慢调用比例
     * 当资源响应时间超过sentinelRT设定的RT时间 &&  QPS大于设定的请求数  && 慢调用超出设定的比例值（sentinel1.8版本增加了比例值）
     *  那么在一定的窗口期内 该服务被降级  等待窗口期时间到则恢复服务
     *
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


    /**
     * sentinel 异常比例 降级
     * 当资源内部发生异常的比例超过设定的比例阈值 && qps超过设定的值  那么该服务会被降级
     * @return
     */
    @GetMapping("/testE")
    public String testE() {
        System.out.println("testD###################");
        int i =10/0;
        System.out.println("testD###################");
        return "------testD";
    }

    /**
     * sentinel 异常数 降级
     * 当该服务在一分钟内发生的异常数超过阈值 那么该服务被降级
     * @return
     */
    @GetMapping("/testECount")
    public String testECount() {
        System.out.println("testD###################");
        int i =10/0;
        System.out.println("testD###################");
        return "------testD";
    }



    @GetMapping("/testHotKey1")
    @SentinelResource(value = "testHotKey1",blockHandler = "deal_testHotKey1")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        return "------testHotKey";
    }

    //兜底方法
    public String deal_testHotKey1 (String p1, String p2, BlockException exception){
        return "------deal_testHotKey,o(╥﹏╥)o";
    }

    /**
     * sentinel  热点限流
     * 根据服务的热点参数对服务进行保护  当该服务指定参数的QPS达到阈值时 该服务会被降级
     *
     * @return
     */
    @GetMapping("/testhotKey")
    @SentinelResource(value = "hotkey" ,blockHandler = "deal_hotkey")
    public String hotKey(@RequestParam(value = "p1",required = false)String p1,
                         @RequestParam(value = "p1",required = false)String p2) {

        return "------testhotKey";
    }

    public String deal_hotkey(String p1, String p2, BlockException e) {
        e.printStackTrace();
        System.out.println("p1 === " + p1);
        System.out.println("p2 === " + p2);
        return "------deal_hotkey";
    }
}
