package com.techelevator;

import com.sun.source.tree.WhileLoopTree;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


public class VendingMachineCLI extends InventoryManager {
    private final Scanner userInput = new Scanner(System.in);
    String pattern = ".00";
    DecimalFormat decimal = new DecimalFormat(pattern);
    Currency curr = Currency.getInstance(Locale.US);
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String choice = "";
    int bogodoCounter = 1;
    AccountController newAccount = new AccountController(0.0);
    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE};

    public VendingMachineCLI() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        VendingMachineCLI cli = new VendingMachineCLI();
        cli.run();


//		Map<String, String> items = new HashMap<>();
//		items = cli.breakUpCsvFile();
    }

    public void run() throws IOException {
        double balance = 0;


        //Main While Loop "Shell"
        while (true) {
            OutputMessage main = new OutputMessage();
            main.mainmenu();


            choice = userInput.nextLine();
            InventoryManager setInventory = new InventoryManager();
            Map<String, VendableItem> inventory = setInventory.inventory();

            //Main Menu Option (1) Display Vending Machine Item
            if (choice.equals("1")) {
                for (Map.Entry<String, VendableItem> item : inventory.entrySet()) {
                    String slot = item.getKey();
                    VendableItem itemObject = item.getValue();

                    System.out.println(slot + " " + itemObject.getName() + " " + fmt.format(itemObject.getPrice()) + " " + itemObject.getQuantity());
                }
                main.mainPurcahsemenu();
                choice = userInput.nextLine();
            }
            //End Main Menu Option (1) Display Vending Machine Item

            //Main Menu Option (2) Purchase
            if (choice.equals("2")) {
                System.out.println();

                //While we're in the Purchase tab
                while (true) {
                    System.out.println("Your balance is: " + fmt.format(balance));
                    main.moneyMenu();
                    String choiceBanana = userInput.nextLine();

                    //Purchase menu option (1) Feed Money
                    if (choiceBanana.equals("1")) {
                        System.out.println("Please enter how much you wish to deposit (whole number only) ");
                        double newbalance = Double.parseDouble(userInput.nextLine());
                        balance = newAccount.deposit(newbalance);
                        System.out.println(fmt.format(balance));
                    }
                    //End Purchase menu option (1) Feed Money

                    //main.mainPurcahsemenu();
                    //choice = userInput.nextLine();

                    //Purchase Menu option (2) Select Product
                    if (choiceBanana.equals("2")) {
                        if(bogodoCounter % 2 == 0)
                        {

                            System.out.println("Flash sale happening! All products are now $1 less!");

                            for (Map.Entry<String, VendableItem> item : inventory.entrySet()) {
                                String slot = item.getKey();
                                VendableItem itemObject = item.getValue();

                                System.out.println(slot + " " + itemObject.getName() + " " + (fmt.format(itemObject.getPrice() - 1))+ " " + itemObject.getQuantity());
                            }
                        }

                        if(bogodoCounter % 2 == 1) {
                            for (Map.Entry<String, VendableItem> item : inventory.entrySet()) {
                                String slot = item.getKey();
                                VendableItem itemObject = item.getValue();
                                System.out.println(slot + " " + itemObject.getName() + " " +  (fmt.format(itemObject.getPrice() )) + " " + itemObject.getQuantity());
                            }
                        }
                        System.out.println("Which item would you like to buy?");
                        choice = userInput.nextLine();

                        for (Map.Entry<String, VendableItem> item : inventory.entrySet()) {
                            String slot = item.getKey();
                            VendableItem itemObject = item.getValue();

                            if(bogodoCounter % 2 == 0 && choice.equals(slot) && balance >= itemObject.getPrice() && itemObject.getQuantity() > 0)
                            {
                                System.out.println("Vending " + itemObject.getName() +  (fmt.format(itemObject.getPrice() - 1)));
                                // subtract the price from balance

                                balance -= itemObject.getPrice();
                                int remain = itemObject.getQuantity() - 1;
                                itemObject.setQuantity(remain);
                                String itemType = itemObject.getItemCategory();

                                if (itemType.equals("Gum")) {
                                    System.out.println("Chew Chew, Yum!");
                                }
                                if (itemType.equals("Drink")) {
                                    System.out.println("Glug Glug, Yum!");
                                }
                                if (itemType.equals("Candy")) {
                                    System.out.println("Yummy Yummy, So Sweet!");
                                }
                                if (itemType.equals("Munchy")) {
                                    System.out.println("Crunch Crunch, Yum!");
                                }bogodoCounter++;
                            }
                            if (choice.equals(slot) && balance < itemObject.getPrice()) {
                                System.out.println("Please insert more money from the main menu!");
                            }
                            if (choice.equals(slot) && itemObject.getQuantity() == 0) {
                                System.out.println("Sold Out!");
                            }

                            if (bogodoCounter % 2 == 1 && choice.equals(slot) && balance > 0 && itemObject.getQuantity() > 0) {
                                if(balance < itemObject.getPrice()){
                                    break;
                                }
                                System.out.println("Vending " + itemObject.getName() +  (fmt.format(itemObject.getPrice() )) );
                                // subtract the price from balance
                                balance -= itemObject.getPrice();
                                int remain = itemObject.getQuantity() - 1;
                                itemObject.setQuantity(remain);
                                String itemType = itemObject.getItemCategory();

                                if (itemType.equals("Gum")) {
                                    System.out.println("Chew Chew, Yum!");
                                }
                                if (itemType.equals("Drink")) {
                                    System.out.println("Glug Glug, Yum!");
                                }
                                if (itemType.equals("Candy")) {
                                    System.out.println("Yummy Yummy, So Sweet!");
                                }
                                if (itemType.equals("Munchy")) {
                                    System.out.println("Crunch Crunch, Yum!");
                                }bogodoCounter++;
                            }
                            if ( itemObject.getQuantity() == 0) {
                                System.out.println("Sold Out!");
                            }
                        }

                    }
                    //End Purchase Menu option (2) Select Product

                    //Purchase Menu option (3) Finish Transaction
                    if (choiceBanana.equals("3")) {
                        System.out.println(fmt.format(balance));
                        System.out.println("Thank you for your purchase, your change will be: ");
                        newAccount.makeChange(balance);
                        System.exit(0);
                    }
                    //End Purchase Menu option (3) Finish Transaction
                }
                //End while we're in the Purchase tab
            }
            //End Main Menu Option (2) Purchase

            //Main Menu Option (3) Exit
            if (choice.equals("3")) {
                System.out.println("Remaining Balance" + fmt.format(balance));
                System.out.println("Thank you for your purchase, your change will be: ");
                newAccount.makeChange(balance);
                System.exit(0);
            }
            //End Main Menu Option (3) Exit
        }
        //End Main While Loop "Shell"
    }
}






