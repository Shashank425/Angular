package com.hexaware.restaurantmgmt.dao;

import com.hexaware.restaurantmgmt.model.Order;


import java.util.Set;


public interface OrderDao {

    Order save(Order order);
    Set<Order> fetchAll();
    void deleteOrder(long orderId);
    Order fetchOrderById(long orderId);

}
