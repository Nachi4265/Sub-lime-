package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

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


    //Add our toppings to our sandwich-toppings
    public void addTopping(Topping toppingsToAdd){
        //todo logic to add toppings.
        sandwichToppings.add(toppingsToAdd);

    }

    //todo Does my Sandwich size determine the price change of my toppings..?
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


        // todo if the sandwich price is  a certain size then the price of the toppings is adjusted.

        
        for (Topping topping : sandwichToppings){
             price = topping.getPrice();
        }

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
