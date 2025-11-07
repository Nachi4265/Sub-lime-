package com.pluralsight;

public class Topping {

    private String name; //What is the topping
    private String category;//Premium or Regular
    boolean isExtra; //true or false

    public Topping(String name, String category,boolean isExtra) {
        this.name = name;
        this.category = category;
        isExtra = isExtra;
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

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", isExtra=" + isExtra +
                '}';
    }
}
