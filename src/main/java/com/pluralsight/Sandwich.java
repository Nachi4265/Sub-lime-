package com.pluralsight;

import java.util.List;

public class Sandwich extends Product{

    private String size;
    private String breadType;
    private boolean isToasted;
    List<Topping>toppings;

    public Sandwich(double price, String description, String size, String breadType, boolean isToasted, List<Topping> toppings) {
        super(price, description);
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

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
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }



    public void addTopping(List<Topping>toppings){
        //todo logic to add toppings.
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
