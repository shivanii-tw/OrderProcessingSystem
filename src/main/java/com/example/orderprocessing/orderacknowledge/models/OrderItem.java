package com.example.orderprocessing.orderacknowledge.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private int itemId;
    private String itemName;
    private double unitPrice;
    private int quantity;
    private int subtotal;

}
