package com.techelevator;

import java.text.NumberFormat;

public abstract class VendableItem implements BuyableItem
{
    private String name;
    private String location;
    private double price;
    private String itemCategory;
    private int quantity =5;
    private int RESTOCK = 5;
//    private int bogodo;

    //Constructor
    public VendableItem(String location, String name, double price, String itemCategory)
    {
        this.name = name;
        this.location = location;
        this.price = price;
        this.itemCategory = itemCategory;
        int quantity = 5;
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
    public int getRESTOCK() {
        return RESTOCK;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getSoundItemMakes() {
        return null;
    }

    public String getItemCategory() {
        return itemCategory;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    public void setRESTOCK(int RESTOCK) {
        this.RESTOCK = RESTOCK;
    }
    //    public void setBogodo(int bogodo) {
//        this.bogodo = bogodo;
//    }
    //End Setters

    public void minusQuantity()
    {
        this.quantity--;
    }
}
