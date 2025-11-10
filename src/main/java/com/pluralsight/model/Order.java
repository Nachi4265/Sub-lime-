package com.pluralsight.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //List of order items
    private List<Product>products;
    private LocalDateTime date;


    //CONSTRUCTOR
    public Order(List<Product> products, LocalDateTime date) {
        this.products = new ArrayList<>();
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
    //A customer can place an order with 0 or more sandwiches on the order. If a
    //customer places an order with 0 sandwiches, they must purchase chips or a drink.
    public boolean isValidOrder(){


       //boolean variable that checks if our List of products has a instanceof a Sandwich
       boolean hasSandwich = products.stream().anyMatch(product -> product instanceof Sandwich);

       //If statements that will determine if our order has a sandwich or not.
       if(hasSandwich){

           return hasSandwich;

       }else{
           return false;
           //add chips or drink
       }

    }



    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", date=" + date +
                '}';
    }







    /* When a customer places the order, they should be prompted to customize each sandwich one at a time.
    A customer should also be able to add drinks and chips to their order.

    When they have completed their order, the application should display the order
    details, including the list of sandwiches that were ordered with all the toppings
    so that the customer can verify that the order is correct. The screen should also
    display the total cost of the order.*/




}
