package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product{

    private String size;
    private String breadType;
    private boolean isToasted;
    private List<Topping> sandwichToppings;



    //CONSTRUCTOR
    public Sandwich(String size, String breadType) {
        super(0, "");
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.sandwichToppings = new ArrayList<>();
    }


    //GETTERS AND SETTERS
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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


    @Override
    public double getPrice() {
        return 0;
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
                '}';
    }
}
