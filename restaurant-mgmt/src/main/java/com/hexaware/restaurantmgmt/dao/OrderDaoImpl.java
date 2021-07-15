package com.hexaware.restaurantmgmt.dao;

import com.hexaware.restaurantmgmt.model.Dish;
import com.hexaware.restaurantmgmt.model.Order;
import com.hexaware.restaurantmgmt.model.OrderLineItem;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Repository
public class OrderDaoImpl implements OrderDao {

    private static Set<Order> orders = new HashSet<>();

    static {
        Dish buttorKulcha = Dish.builder().dishId(11).price(200).calories(440).build();
        Dish tawaPulav = Dish.builder().dishId(12).price(150).calories(300).build();

        OrderLineItem item1 = OrderLineItem.builder()
                .oderLineItemId(12)
                .quantity(2)
                .dish(buttorKulcha)
                .unitPrice(200)
                .build();

        OrderLineItem item2 = OrderLineItem.builder()
                .oderLineItemId(13)
                .quantity(3)
                .dish(tawaPulav)
                .unitPrice(200)
                .build();

        Set<OrderLineItem> lineItems = new HashSet<>();
        lineItems.add(item1);
        lineItems.add(item2);

        Order order = Order.builder()
                .orderDate(LocalDate.now())
                .orderId(100)
                .orderLineItems(lineItems)
                .orderPrice(4000)
                .customerName("Raghav").build();

        orders.add(order);
    }

    @Override
    public Order save(Order order) {
        orders.add(order);
        return  order;
    }

    @Override
    public Set<Order> fetchAll() {
        return orders;
    }

    @Override
    public void deleteOrder(long orderId) {
        for(Order order: orders){
            if (order.getOrderId() == orderId){
                orders.remove(order);
            }
        }
    }

    @Override
    public Order fetchOrderById(long orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

}
