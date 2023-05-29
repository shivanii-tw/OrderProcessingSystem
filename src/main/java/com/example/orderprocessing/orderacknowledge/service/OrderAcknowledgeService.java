package com.example.orderprocessing.orderacknowledge.service;

import com.example.orderprocessing.orderacknowledge.models.OrderDetails;
import com.example.orderprocessing.orderacknowledge.sender.OrderMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAcknowledgeService {

    @Autowired
    private OrderMessageSender orderMessageSender;
    public void addOrderDetails(OrderDetails orderDetails) {
        orderMessageSender.send(orderDetails.toString());
    }

}
