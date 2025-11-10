package com.pluralsight.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    //List of order items
    private List<Product>products;
    private LocalDateTime date;


    //CONSTRUCTOR
    public Order(List<Product> products, LocalDateTime date) {
        this.products = products;
        this.date = date;
    }

    public Order() {
        this.products = new ArrayList<>();
        this.date = LocalDateTime.now();
    }



    //GETTERS AND SETTERS
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }



    //Add products to order.
    public void addProduct(Product product){
        products.add(product);
    }

    //Get the total of all the items.
    public double calculateTotal(){
        return products.stream().mapToDouble(products -> products.getPrice()).sum();
    }

    //VALID ORDER?
    public boolean isValidOrder(){


       //boolean variable that checks if our List of products has a instanceof a Sandwich
       boolean hasSandwich = products.stream().anyMatch(product -> product instanceof Sandwich);
       boolean hasChips = products.stream().anyMatch(product -> product instanceof Chip);
       boolean hasDrink = products.stream().anyMatch(product -> product instanceof Drink);

       //If statements that will determine if our order has a sandwich or not.
       if(hasSandwich){

           return true;

       } else if (hasChips || hasDrink) {
           return true;
       }else {
           return false;
           //add chips or drink
       }

    }

    @Override
    public String toString() {
        return "DATE & TIME: " + date + "|" +"\n" + "Items purchased: " + products + "|";


    }

}
