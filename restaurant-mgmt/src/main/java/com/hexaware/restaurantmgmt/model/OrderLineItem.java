package com.hexaware.restaurantmgmt.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of="orderLineItemId")
public class OrderLineItem {

    private int oderLineItemId;

    private double unitPrice;

    private int quantity;

    private Dish dish;

    private Order order;
}
