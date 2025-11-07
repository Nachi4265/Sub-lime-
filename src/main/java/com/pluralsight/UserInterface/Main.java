package com.pluralsight.UserInterface;

import com.pluralsight.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");


        Sandwich sandwich = new Sandwich("small","white");
        sandwich.setToasted(true);


        sandwich.addTopping(new Topping("lettuce","regular",false));
        sandwich.addTopping(new Topping("Bacon","Meat",true));

        System.out.println(sandwich);

        Drink drink = new Drink("small","grape");
        System.out.println(drink);

    }
}