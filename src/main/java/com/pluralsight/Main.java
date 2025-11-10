package com.pluralsight;

import com.pluralsight.data.ProductLists;
import com.pluralsight.model.Chip;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Topping;

public class Main {
    public static void main(String[] args) {


        Sandwich sandwich = new Sandwich(4,"white");
        Topping topping1 = new Topping("ham","meat",false);
        sandwich.addTopping(topping1);

        Chip chip1 = new Chip("BBQ","Lays");


        Order o = new Order(chip1);

    }
}