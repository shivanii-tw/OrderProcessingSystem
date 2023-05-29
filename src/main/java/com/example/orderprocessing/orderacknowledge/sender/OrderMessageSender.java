package com.example.orderprocessing.orderacknowledge.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.orderQueue}")
    private String queue;

    public void send(String message){
        jmsTemplate.convertAndSend(queue, message);
    }
}
