package com.example.orderprocessing.shipmenttracking;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ShipmentTrackingListener {

    private static final Logger LOGGER = Logger.getLogger(ShipmentTrackingListener.class.toString());

    @JmsListener(destination = "${springjms.orderQueue}")
    public void receive(String message){
        LOGGER.info("Message received by ShipmentTracking "+message);
    }
}
