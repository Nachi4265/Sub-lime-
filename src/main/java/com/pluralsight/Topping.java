package com.pluralsight;

public class Topping {

    private String name; //What is the topping
    private String category;//Premium or Regular
    boolean isExtra; //true or false

    public Topping(String name, String category,boolean isExtra) {
        this.name = name;
        this.category = category;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }



    public double getPrice(){

        //If one of the topping names match it will use the following price
        double price = switch (name) {
            case "steak", "ham", "salami", "roast beef", "chicken", "bacon" -> 1.00;
            case "american", "provolone", "cheddar", "swiss" -> 0.75;
            default -> 0;
        };
        
        return price;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", isExtra=" + isExtra +
                ", price =" + getPrice() +
                '}';
    }
}
