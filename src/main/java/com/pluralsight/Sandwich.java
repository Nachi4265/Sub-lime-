package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sandwich extends Product{

    private int size;
    private String breadType;
    private boolean isToasted;
    private List<Topping> sandwichToppings;



    //CONSTRUCTOR
    public Sandwich(int size, String breadType) {
        super(0, "");
        this.size = size;
        this.breadType = breadType;
        this.isToasted = false;
        this.sandwichToppings = new ArrayList<>();
    }


    //GETTERS AND SETTERS
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public List<Topping> getToppings() {
        return sandwichToppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.sandwichToppings = new ArrayList<>(toppings);
    }


    //ADD METHODS -----------------------------------------------------------------------------------------------

    //Add Meats
    public void addMeat(Topping meat){
        sandwichToppings.add(meat);
    }

    public void addExtraMeat(Topping extraMeat){
        sandwichToppings.add(extraMeat);
    }


    //Add Cheeses
    public void addCheese(Topping cheese){
        sandwichToppings.add(cheese);
    }

    public void addExtraCheese(Topping extraCheese){
        sandwichToppings.add(extraCheese);
    }


    //add regular toppings
    public void addTopping(Topping toppingsToAdd){
        //todo logic to add toppings.
        sandwichToppings.add(toppingsToAdd);

    }





    //This one method is trying to do too much!
    // Make a method that calculates the price for topping and extra toppings that return the price for those,
    // Then add those the get price method.(return the total price

    @Override
    public double getPrice() {

        double price = 0;

        switch (size){
            case 4:
                price = 5.50;
                break;
            case 8:
                price = 7.00;
                break;
            case 12:
                price = 8.50;
                break;
            default:
                price = 0;
                break;
        }

//        //Gets the price of all the toppings on the sandwich
//        for (Topping topping : sandwichToppings){
//             price += topping.getPrice();
//
//
//             if(topping.isExtra()&& topping.getCategory().equalsIgnoreCase("meat")&&size == 4){
//                 price = price + .50;
//             } else if (topping.isExtra()&& topping.getCategory().equalsIgnoreCase("meat")&&size == 8) {
//                 price = price + 1.00;
//             } else if (topping.isExtra()&& topping.getCategory().equalsIgnoreCase("meat")&&size == 12) {
//                 price = price + 1.50;
//             } else if (topping.isExtra()&& topping.getCategory().equalsIgnoreCase("cheese")&&size == 4) {
//                 price = price += .30;
//             }else if (topping.isExtra()&& topping.getCategory().equalsIgnoreCase("cheese")&&size == 8) {
//                 price = price += .60;
//             }else if (topping.isExtra()&& topping.getCategory().equalsIgnoreCase("cheese")&&size == 12) {
//                 price = price += .90;
//             }else {
//                 price += 0;
//             }
//
//        }
        return price;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size='" + size + '\'' +
                ", breadType='" + breadType + '\'' +
                ", isToasted=" + isToasted +
                ", sandwichToppings=" + sandwichToppings +
                ", sandwich price=" + getPrice() +
                '}';
    }
}
