package com.techelevator;

import java.math.BigDecimal;

public class Beverages extends VendableItem
{private String name;
    private String location;
    private double price;
    private String itemCategory;

    //Constructor
    public Beverages(String name, String location, double price, String soundItemMakes)
    {
        super(name, location, price, soundItemMakes);
    }
    //End Constructor
    {
        this.name = name;
        this.location = location;
        this.price = price;
        this.itemCategory = itemCategory;
//        this.bogodo = bogodo;
    }
    //End Constructor

    //Getters
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public double getPrice() {
        return price;
    }
    public String getItemCategory() {
        return itemCategory;
    }
//    public int getBogodo() {
//        return bogodo;
//    }
    //End Getters


    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }
}
