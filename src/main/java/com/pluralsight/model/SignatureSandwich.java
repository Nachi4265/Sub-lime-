package com.pluralsight.model;

public class SignatureSandwich extends Sandwich {

    public Sandwich theEverything(){
        Sandwich sandwich = new Sandwich();
        sandwich.setSize(12);
        sandwich.setBreadType("White");
        sandwich.setToasted(true);

        //add every single topping
            Topping topping1 = new Topping("Steak", "Meat", true);
            sandwich.addTopping(topping1);

            Topping topping2 = new Topping("Ham", "Meat", true);
            sandwich.addTopping(topping2);

            Topping topping3 = new Topping("Salami", "Meat", true);
            sandwich.addTopping(topping3);

            Topping topping4 = new Topping("Roast Beef", "Meat", true);
            sandwich.addTopping(topping4);

            Topping topping5 = new Topping("Chicken", "Meat", true);
            sandwich.addTopping(topping5);

            Topping topping6 = new Topping("Bacon", "Meat", true);
            sandwich.addTopping(topping6);

            // ===== CHEESES (isExtra = true) =====
            Topping topping7 = new Topping("American", "Cheese", true);
            sandwich.addTopping(topping7);

            Topping topping8 = new Topping("Provolone", "Cheese", true);
            sandwich.addTopping(topping7);

            Topping topping9 = new Topping("Cheddar", "Cheese", true);
            sandwich.addTopping(topping8);

            Topping topping10 = new Topping("Swiss", "Cheese", true);
            sandwich.addTopping(topping10);

            // ===== REGULAR TOPPINGS (isExtra = false) =====
            Topping topping11 = new Topping("Lettuce", "Regular Topping", false);
            sandwich.addTopping(topping11);

            Topping topping12 = new Topping("Peppers", "Regular Topping", false);
            sandwich.addTopping(topping12);

            Topping topping13 = new Topping("Onions", "Regular Topping", false);
            sandwich.addTopping(topping13);

            Topping topping14 = new Topping("Tomatoes", "Regular Topping", false);
            sandwich.addTopping(topping14);

            Topping topping15 = new Topping("Jalapeños", "Regular Topping", false);
            sandwich.addTopping(topping15);

            Topping topping16 = new Topping("Cucumbers", "Regular Topping", false);
            sandwich.addTopping(topping16);

            Topping topping17 = new Topping("Pickles", "Regular Topping", false);
            sandwich.addTopping(topping17);

            Topping topping18 = new Topping("Guacamole", "Regular Topping", false);
            sandwich.addTopping(topping18);

            Topping topping19 = new Topping("Mushrooms", "Regular Topping", false);
            sandwich.addTopping(topping19);

            // ===== SAUCES (isExtra = false) =====
            Topping topping20 = new Topping("Mayo", "Sauce", false);
            sandwich.addTopping(topping20);

            Topping topping21 = new Topping("Mustard", "Sauce", false);
            sandwich.addTopping(topping21);

            Topping topping22 = new Topping("Ketchup", "Sauce", false);
            sandwich.addTopping(topping22);

            Topping topping23 = new Topping("Ranch", "Sauce", false);
            sandwich.addTopping(topping23);

            Topping topping24 = new Topping("Thousand Islands", "Sauce", false);
            sandwich.addTopping(topping24);

            Topping topping25 = new Topping("Vinaigrette", "Sauce", false);
            sandwich.addTopping(topping25);

            Topping topping26 = new Topping("Au Jus", "Sauce", false);
            sandwich.addTopping(topping26);

            return sandwich;
    }

    public Sandwich theClassic(){
        Sandwich sandwich = new Sandwich();
        sandwich.setSize(4);
        sandwich.setBreadType("Wheat");
        sandwich.setToasted(false);

        Topping topping2 = new Topping("Ham", "Meat", true);
        sandwich.addTopping(topping2);

        Topping topping11 = new Topping("Lettuce", "Regular Topping", false);
        sandwich.addTopping(topping11);

        Topping topping20 = new Topping("Mayo", "Sauce", false);
        sandwich.addTopping(topping20);

        return sandwich;
    }

    public Sandwich theVeggieWrap(){

        Sandwich sandwich = new Sandwich();
        sandwich.setSize(8);
        sandwich.setBreadType("wrap");
        sandwich.setToasted(false);

        Topping topping11 = new Topping("Lettuce", "Regular Topping", false);
        sandwich.addTopping(topping11);

        Topping topping12 = new Topping("Peppers", "Regular Topping", false);
        sandwich.addTopping(topping12);

        Topping topping13 = new Topping("Onions", "Regular Topping", false);
        sandwich.addTopping(topping13);

        Topping topping14 = new Topping("Tomatoes", "Regular Topping", false);
        sandwich.addTopping(topping14);

        Topping topping15 = new Topping("Jalapeños", "Regular Topping", false);
        sandwich.addTopping(topping15);

        Topping topping16 = new Topping("Cucumbers", "Regular Topping", false);
        sandwich.addTopping(topping16);

        Topping topping17 = new Topping("Pickles", "Regular Topping", false);
        sandwich.addTopping(topping17);

        Topping topping18 = new Topping("Guacamole", "Regular Topping", false);
        sandwich.addTopping(topping18);

        Topping topping19 = new Topping("Mushrooms", "Regular Topping", false);
        sandwich.addTopping(topping19);

        return sandwich;

    }





}
