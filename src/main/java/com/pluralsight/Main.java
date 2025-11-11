package com.pluralsight;

import com.pluralsight.UserInterface.UserInterface;
import com.pluralsight.data.ProductLists;
import com.pluralsight.model.*;

public class Main {
    public static void main(String[] args) {


        Sandwich sandwich = new Sandwich(4,"white");
        Topping topping1 = new Topping("ham","meat",false);
        Topping topping2 = new Topping("chedder","cheese",false);
        sandwich.addTopping(topping1);
        sandwich.addTopping(topping2);

        Chip chip1 = new Chip("BBQ","Lays");
        Drink drink1  = new Drink("large","pepsi");

       Product p = sandwich;
       Product p2 =chip1;
       Product p3 = drink1;

        Order order101 = new Order();
        order101.addProduct(p);
        order101.addProduct(p2);
        order101.addProduct(p3);
        order101.isValidOrder();
        order101.calculateTotal();

        System.out.println(order101.getOrderDetails());

       // -------------------------------------------
        UserInterface ui = new UserInterface();
        ui.homeScreen();
    }
}