package com.pluralsight;

public class Drink extends Product{

    private String size;
    private String flavor;

    public Drink(double price, String description, String size, String flavor) {
        super(price, description);
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
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }

    //PRICE CALC
}
