package com.pluralsight;

public class Topping {

    private String name; //What is the topping
    private String Category;//Premium or Regular
    boolean isExtra; //true or false

    public Topping(String name, String category, boolean isExtra) {
        this.name = name;
        this.Category = category;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
}
