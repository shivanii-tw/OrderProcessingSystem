package com.example.orderprocessing.orderacknowledge.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    private int orderId;
    private String customerName;
    private String email;
    private String shippingAddress;
    private List<OrderItem> orderItems;
    private double totalAmount;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDate orderDate;
    private OrderStatus orderStatus;

}
