package com.xulihuazj.activemqtest.api;

import com.xulihuazj.activemqtest.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test_activemq_queue_name1}")
    private String queueName;

    @Autowired
    private Producer producer;

    @RequestMapping("/send")
    private String testSendMessage() {
        for (int i = 0; i < 10; i++) {
            try {
                this.producer.sendMessage(queueName, "test_message" + i);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return "success";
    }


}
