package com.hexaware.restaurantmgmt.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "orderId")
@Builder
@AllArgsConstructor
public class Order {

    private long orderId;
    private LocalDate orderDate;
    private double orderPrice;
    private String customerName;
    private Set<OrderLineItem> orderLineItems;

}
