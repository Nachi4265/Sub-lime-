package com.pluralsight.data;

import com.pluralsight.model.Order;

public class OrderManager {
    private Order order;

    public void startNewOrder(){
        this.order = new Order();
    }

    public Order getCurrentOrder(){
        return order;
    }

    //CANCEL ORDER
    public Order cancelOrder(){
        return order = null;
    }


}
