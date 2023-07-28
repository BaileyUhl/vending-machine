package com.techelevator;

import java.math.BigDecimal;

public class VendableItem implements BuyableItem
{
    private String name;
    private String location;
    private double price;
    private String itemCategory;
//    private int bogodo;

    //Constructor
    public VendableItem(String name, String location, double price, String itemCategory)
    {
        this.name = name;
        this.location = location;
        this.price = price;
        this.itemCategory = itemCategory;
//        this.bogodo = bogodo;
    }
    //End Constructor

    //Getters
    public String getName(){
        return name;
    }
    public String getLocation() {
        return location;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String getSoundItemMakes() {
        return null;
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
//    public void setBogodo(int bogodo) {
//        this.bogodo = bogodo;
//    }
    //End Setters




}
