package com.pluralsight.model;

public class Chip extends Product {

    private String chipName;

    public Chip( String description, String chipName) {
        super(1.50,"Chips");
        this.chipName = chipName;
    }

    //GETTERS AND SETTERS
    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }



    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String getDescription() {
        return chipName ;
    }

    @Override
    public String toString() {
        return chipName + getPrice();
    }
}
