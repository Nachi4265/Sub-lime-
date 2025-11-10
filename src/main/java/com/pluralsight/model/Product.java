package com.pluralsight.model;

public abstract class Product {

    public double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public abstract double getPrice();

    public abstract String getDescription();


}
