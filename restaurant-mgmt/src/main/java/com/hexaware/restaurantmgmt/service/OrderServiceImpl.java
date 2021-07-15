package com.hexaware.restaurantmgmt.service;

import com.hexaware.restaurantmgmt.dao.OrderDao;
import com.hexaware.restaurantmgmt.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;


    @Override
    public Order save(Order order) {
        return this.orderDao.save(order);
    }

    @Override
    public Set<Order> fetchAllOrders() {
        return this.orderDao.fetchAll() ;
    }

    @Override
    public void deleteOrderById(long orderId) {
        this.orderDao.deleteOrder(orderId);
    }

    @Override
    public Order fetchOrderById(long orderId) {
        return this.orderDao.fetchOrderById(orderId);
    }
}
