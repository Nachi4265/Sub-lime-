package com.pluralsight;

import com.pluralsight.data.ProductLists;
import com.pluralsight.model.*;

public class Main {
    public static void main(String[] args) {


        Sandwich sandwich = new Sandwich(4,"white");
        Topping topping1 = new Topping("ham","meat",false);
        sandwich.addTopping(topping1);

        Chip chip1 = new Chip("BBQ","Lays");

       Product p = sandwich;
       Product p2 =chip1;

        Order order101 = new Order();
        order101.addProduct(p);
        order101.addProduct(p2);
        order101.isValidOrder();
        order101.calculateTotal();

        System.out.println(order101.calculateTotal());



    }
}