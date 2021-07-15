package com.hexaware.restaurantmgmt.service;

import com.hexaware.restaurantmgmt.model.Order;

import java.util.Set;

public interface OrderService {

    public Order save(Order order);
    public Set<Order> fetchAllOrders();
    public void deleteOrderById(long orderId);
    public Order fetchOrderById(long orderId);
}
