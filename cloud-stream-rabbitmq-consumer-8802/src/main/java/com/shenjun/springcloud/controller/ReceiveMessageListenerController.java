package com.shenjun.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-22 11:57
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    private Logger logger = LoggerFactory.getLogger(ReceiveMessageListenerController.class);

    @Value("${server.port}")
    private String serverPort;


    @EventListener
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        logger.info("receive message" + message);
        System.out.println("消费者1号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
    }
}
