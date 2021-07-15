package com.hexaware.restaurantmgmt.controller;

import com.hexaware.restaurantmgmt.model.Order;
import com.hexaware.restaurantmgmt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
 
    @Autowired
    private OrderService orderService;

    @GetMapping
    public Set<Order> fetchAllOrders(){
        return this.orderService.fetchAllOrders();
    }
    @PostMapping
    public Order save(@RequestBody Order order){
        return this.orderService.save(order);
    }
    @DeleteMapping("{/orderId}")
    public void deleteOrderById(long orderId){
        this.orderService.deleteOrderById(orderId);
    }
    @GetMapping("{/orderId}")
    public Order fetchOrderById(@PathVariable long orderId){
        return this.orderService.fetchOrderById(orderId);
    }




}
