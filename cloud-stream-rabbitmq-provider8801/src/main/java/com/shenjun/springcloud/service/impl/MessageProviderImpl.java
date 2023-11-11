package com.shenjun.springcloud.service.impl;

import com.shenjun.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

import javax.annotation.Resource;

import org.springframework.cloud.stream.messaging.Source;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private Source source; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(serial);
        source.output().send(messageBuilder.build());
        System.out.println("serial = " + serial);
        return "发送id"+serial;
    }

}
