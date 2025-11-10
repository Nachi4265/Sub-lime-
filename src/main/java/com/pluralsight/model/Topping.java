package com.pluralsight.model;

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



    public double getPrice(int size) {

        //If one of the topping names match it will use the following price
        double price = 0;

        switch (category) {

            //is it meat??
            case "meat":
                if(size == 4){
                    price = 1.00;
                } else if (size == 8) {
                    price = 2.00;
                } else if (size == 12) {
                    price = 3.00;}


                if (isExtra && size == 4) {
                    price += .50;
                } else if (isExtra && size == 8) {
                    price += 1.00;
                } else if (isExtra && size == 12) {
                    price += 1.50;
                }
                break;


            //Is it Cheese??
            case "cheese":

                if(size == 4){
                    price = .75;
                } else if (size == 8) {
                    price = 1.50;
                } else if (size == 12) {
                    price = 2.25;}


                if (isExtra && size == 4) {
                    price += .30;
                } else if (isExtra && size == 8) {
                    price += .60;
                } else if (isExtra && size == 12) {
                    price += .90;
                }
                break;

            default:
                price = 0;
        }
        return price;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", isExtra=" + isExtra +
                '}';
    }
}
