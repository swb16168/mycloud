package com.swb.cloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author 72774
 * @Description
 * @create 2021-01-30 11:37
 */
@Component
@EnableBinding(Sink.class)
public class StreamConsumer {


    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message){
        System.out.println("消费者1号，接收到消息-------->" + message.getPayload());
    }
}
