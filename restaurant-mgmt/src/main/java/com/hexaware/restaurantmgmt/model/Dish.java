package com.hexaware.restaurantmgmt.model;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "dishId")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Dish {

    private long dishId;

    private double price;

    private double calories;
}
