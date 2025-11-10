package com.pluralsight;

import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Topping;

public class Main {
    public static void main(String[] args) {

//        Topping cheese = new Topping("swiss","premium",false);
          Topping top = new Topping("ham","meat",false);
            Topping top2 = new Topping("ham","meat",true);


        Sandwich sandwich = new Sandwich(8,"White");
//        sandwich.addTopping(cheese);
        sandwich.addTopping(top);
        sandwich.addTopping(top2);


        System.out.println(sandwich);

//        System.out.println(topping);
//
//        Drink drink = new Drink("large","grape");
//        System.out.println(drink);

    }
}