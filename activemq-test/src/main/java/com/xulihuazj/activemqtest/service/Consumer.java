package com.xulihuazj.activemqtest.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class Consumer {

    @JmsListener(destination = "${test_activemq_queue_name1}", concurrency = "2-6")
    public void consumerMessage(TextMessage message) {
        System.out.println("消费者收到队列中的信息为=" + message);
    }

}
