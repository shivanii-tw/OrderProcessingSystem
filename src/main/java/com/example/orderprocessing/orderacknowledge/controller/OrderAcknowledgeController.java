package com.example.orderprocessing.orderacknowledge.controller;

import com.example.orderprocessing.orderacknowledge.models.OrderDetails;
import com.example.orderprocessing.orderacknowledge.service.OrderAcknowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class OrderAcknowledgeController {

    @Autowired
    private OrderAcknowledgeService orderAcknowledgeService;

    @PostMapping("/orderDetails")
    public ResponseEntity<Object> addOrderDetails(@RequestBody OrderDetails orderDetails) {
        orderAcknowledgeService.addOrderDetails(orderDetails);

        String successMessage = "added successfully";
        return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
    }

}
