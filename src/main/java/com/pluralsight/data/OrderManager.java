package com.pluralsight.data;

public class OrderManager {
    private Order order;

    public Order getCurrentOrder(){
        return order;
    }

    //CANCEL ORDER
    public Order cancelOrder(){
        return order = null;
    }

}
