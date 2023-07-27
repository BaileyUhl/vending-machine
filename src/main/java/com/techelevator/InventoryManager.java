package com.techelevator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager
{
    private Map<String, String> spaceAndItemName = new HashMap<>();
    private Map<Double, String> priceAndType = new HashMap<>();
    private int INITIAL_INVENTORY_AND_RESTOCK = 5;

    public InventoryManager() throws FileNotFoundException {
    }

    public Map<String, String> getSpaceAndItemName() {
        return spaceAndItemName;
    }

    //Getters
    public int getINITIAL_INVENTORY_AND_RESTOCK()
    {
        return INITIAL_INVENTORY_AND_RESTOCK;
    }
    //End Gettter







    public Map<String,String> breakUpCsvFile(){
    File inputFile = new File("main.csv");
    String file = "main.csv";
    String line = "";
        Map<String, String> spaceAndItemName = new HashMap<>();
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) !=null)
            {
                String [] items = line.split(",");

                for (int i = 0; i <= items.length ; i+= 2)
                {
                    spaceAndItemName.put(items[0], items[1]);
                }
        }
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }return spaceAndItemName;
    }







//    try(Scanner reader = new Scanner(inputFile)){
//        while (reader.hasNextLine()) {
//            String items = reader.nextLine();
//            String[] allItems = items.split(",");
//            Map<String,String> ItemPlaceAndName = new HashMap<>();
//            ItemPlaceAndName.put(1,2);
//
//        }
//    }
}



    //Setters
    //End Setters










