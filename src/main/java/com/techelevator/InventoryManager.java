package com.techelevator;

import java.io.*;
import java.time.format.FormatStyle;
import java.util.*;

public class InventoryManager
{
    private Map<String, String> spaceAndItemName = new HashMap<>();
    private Map<Double, String> priceAndType = new HashMap<>();


    public InventoryManager() throws FileNotFoundException {
    }

    public Map<String, String> getSpaceAndItemName() {
        return spaceAndItemName;
    }



    public Map<String, VendableItem> inventory() throws IOException {
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

}














