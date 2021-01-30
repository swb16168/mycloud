package com.swb.cloud.controller;

import com.swb.cloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 72774
 * @Description
 * @create 2021-01-30 10:59
 */
@RestController
@Slf4j
public class MessageSendController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/stream/send")
    public String sendMsg(){
        UUID uuid = UUID.randomUUID();

        boolean b = messageProvider.sendMessage(uuid.toString());

        return uuid.toString() +"send result ---->" + b;
    }
}
