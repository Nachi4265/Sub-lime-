package com.pluralsight.data;

import com.pluralsight.model.Product;

public class OrderManager {
    private Order order;

    public Order getCurrentOrder(){
        return order;
    }

    //CANCEL ORDER
    public Order cancelOrder(){
        return order = null;
    }

    public void addProduct(Product product){
        //todo
    }

}
