package com.pluralsight;

public class Chip extends Product {

    private String chipName;

    public Chip(double price, String description, String chipName) {
        super(price, description);
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
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
