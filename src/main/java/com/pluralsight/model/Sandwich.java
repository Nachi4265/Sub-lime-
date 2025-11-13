package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {

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

    public Sandwich(){
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
        //this.sandwichToppings = new ArrayList<>(toppings);
        this.sandwichToppings = toppings;
    }

    public boolean sandwichIsValid(){
        if( breadType != null && sandwichToppings != null){
            System.out.println("Sandwich is Valid");
            return true;
        }else {
            System.out.println("Please ensure you have Bread type selected and a topping");
            return false;
        }
    }


    //ADD METHOD -------------------------------------------------------------------------------------------------------

    public void addTopping(Topping toppingsToAdd){
        //todo logic to add toppings.
        sandwichToppings.add(toppingsToAdd);

    }

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

       //Gets the price of all the toppings on the sandwich based on the sandwiches size
        for (Topping topping : sandwichToppings){
             price += topping.getPrice(this.size);
       }
        return price;
    }

    @Override
    public String getDescription() {
        return this.size+ " inch "+ breadType +" bread " + "sandwich" + "\n" + sandwichToppings;
    }

    @Override
    public String toString() {
        return breadType + " Sandwich with " + "\n"+ sandwichToppings + "sandwich price: " + getPrice();
    }
}
