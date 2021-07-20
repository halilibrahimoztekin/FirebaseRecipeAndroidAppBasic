package com.isoas.fooddinnerdietblogwithfirebase.models;

public class Ingredients {
     String quantity;
     String name;
     String type;

    public Ingredients(String quantity, String name, String type) {
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    }

    public Ingredients() {
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
