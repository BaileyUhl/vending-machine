package com.techelevator;

import java.io.*;
import java.text.DecimalFormat;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.logging.LogManager;

public class InventoryManager extends LogManager
{
    private Map<String, String> spaceAndItemName = new HashMap<>();
    private Map<Double, String> priceAndType = new HashMap<>();


    public InventoryManager() throws FileNotFoundException {
    }

    public Map<String, String> getSpaceAndItemName()
    {
        return spaceAndItemName;
    }


    public Map<String, VendableItem> inventory() throws IOException
    {
        File inputFile = new File("main.csv");
        Map<String, VendableItem> inventory = new HashMap<>();
        String line = "";
        String file = "main.csv";
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line = br.readLine()) !=null)
        {
            String[] itemInfo = line.split(",");
            String itemCode = itemInfo[0];
            String itemName = itemInfo[1];
            double itemPrice = Double.parseDouble(itemInfo[2]);
            String itemType = itemInfo[3];

            if(itemType.equals("Gum"))
            {
                VendableItem currentItem = new Gum(itemCode, itemName, itemPrice, itemType);
                inventory.put(itemCode, currentItem);
            }
            if (itemType.equals("Drink"))
            {
                VendableItem currentItem = new Drink(itemCode, itemName, itemPrice, itemType);
                inventory.put(itemCode, currentItem);
            }
            if (itemType.equals("Munchy"))
            {
                VendableItem currentItem = new Munchy(itemCode, itemName, itemPrice, itemType);
                inventory.put(itemCode, currentItem);
            }
            if (itemType.equals("Candy"))
            {
                VendableItem currentItem = new Candy(itemCode, itemName, itemPrice, itemType);
                inventory.put(itemCode, currentItem);
            }
        }
        return inventory;
    }
    public String[] change (double balance)
    {
        String [] changer = new String[0];
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int change = 0;
        balance = (int) change;
        int dollars = (int)change;
        int twenties = dollars / 20;
        int dollars1 = dollars % 20;
        int tens = dollars1 / 10;
        int dollars2 = dollars % 10;
        int fives = dollars2 / 5;
        int dollars3 = dollars % 5;
        int ones = dollars3;

        String moneyString = decimalFormat.format(change);
        String changeString = Double.toString(change);
        String[] parts = moneyString.split("\\.");
        String part2 = parts[1];
        double cents5 = Double.parseDouble(part2);

        int cents = (int)cents5;
        int quarters = cents / 25;
        int cents1 = cents % 25;
        int dimes = cents1 / 10;
        int cents2 = cents % 10;
        int nickels = cents2 / 5;
        int cents3 = cents % 5;
        int pennies = cents3;

        return changer;
    }
}















