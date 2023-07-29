package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class OutputMessage extends InventoryManager
{
    public OutputMessage() throws FileNotFoundException {
    }

    public void allDone()
    {
        System.out.println("Thanks for shopping!");
    }
    public void giveUsMoney()
    {
        System.out.println("Please deposit money.");
    }
    public void insufficientFunds()
    {
        System.out.println("Sorry, you have insufficient funds :(");
    }
    public void vendingItem()
    {
        System.out.println("Vending your item now!");

    }
    public void takeYourChange()
    {
        System.out.println("Please take your change.");
    }
    public void soldOut()
    {
        System.out.println("Sorry, the item you inputted is sold out.");
    }
    public void mainmenu()
    {   System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        System.out.println("⚡⚡⯈Welcome to the best vending machine in town!⯇⚡⚡");
        System.out.println("⚡⚡                                               ⚡⚡");
        System.out.println("⚡⚡Choose one of the following options:           ⚡⚡"
                + "\n" + "⚡⚡(⯈ 1) Display Vending Machine Items            ⚡⚡"
                + "\n" + "⚡⚡(⯈ 2) Purchase                                 ⚡⚡"
                + "\n" + "⚡⚡(⯈ 3) Exit                                     ⚡⚡");
        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
    }
    public void mainPurcahsemenu()
    {System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println();
        System.out.println("Choose one of the following options:"
                + "\n" + "(⯈ 2) Purchase" + "\n" + "(⯈ 3) Exit");
        System.out.println(" ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
    }
    public void moneyMenu()
    {System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println();
        System.out.println("Choose one of the following options:" + "\n" + "(⯈ 1) Feed Money "
                + "\n" + "(⯈ 2) Select Product" + "\n" + "(⯈ 3) Finish Transaction");
        System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
    }

    public void mainsssss() throws IOException {
        InventoryManager setInventory = new InventoryManager();
        Map<String, VendableItem> inventory = setInventory.inventory();
        for( Map.Entry<String,VendableItem> item : inventory.entrySet()) {

            String slot = item.getKey();
            VendableItem itemObject = item.getValue();
            System.out.println(slot + " " + itemObject.getName() + " " + itemObject.getPrice() + " " + itemObject.getQuantity());

    }}}
