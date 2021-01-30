package com.swb.cloud.service.impl;


import com.swb.cloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;



@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider
{
    @Resource
    private MessageChannel output; // 消息发送管道
    @Override
    public boolean sendMessage(String msg) {
        boolean send = output.send(MessageBuilder.withPayload(msg).build());
        System.out.println("*****msg: "+msg);
        return send;
    }
}
