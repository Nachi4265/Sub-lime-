package com.pluralsight;

public class Drink extends Product{

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        super(0, "");
        this.size = size;
        this.flavor = flavor;
    }

    //GETTERS AND SETTERS
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    @Override
    public double getPrice() {

        double price = 0;

        switch (size){
            case "small":
                return price= 2.00;

            case "medium":
                return price= 2.50;

            case "large":
                return price= 3.00;
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String toString() {
        return "Drink size: " + size + " | " + "Flavor: " + flavor + " | " +"price: "+ getPrice();
    }

    //PRICE CALC
}
