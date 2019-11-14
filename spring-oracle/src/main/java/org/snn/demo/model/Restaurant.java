package org.snn.demo.model;

import javax.persistence.*;

@Entity
public class Restaurant {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="restaurant_id",nullable = false)
    private Long restaurantId;

    @Column(name="restaurant_name",nullable = false)
    private String restaurantName;

    @Column(name="phone_num",nullable = false)
    private String phoneNum;

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurant_name() {
        return restaurantName;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurantName = restaurant_name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
