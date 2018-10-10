package com.xulihuazj.activemqtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsMessageOperations;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
//    @Qualifier(value = "jmsMessagingTemplate")
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息
     *
     * @param destination 发送的目的队列
     * @param message     发送的message
     */
    public void sendMessage(String destination, final String message) {
//        jmsMessagingTemplate.convertAndSend(destination,message);
        jmsTemplate.convertAndSend(destination, message);
    }


}
