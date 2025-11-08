package com.pluralsight.UserInterface;

import com.pluralsight.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Topping topping = new Topping("swiss","premium",false);

        Sandwich sandwich = new Sandwich(4,"White");

        System.out.println(sandwich);

//        System.out.println(topping);
//
//        Drink drink = new Drink("large","grape");
//        System.out.println(drink);

    }
}