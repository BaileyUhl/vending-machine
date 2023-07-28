package com.techelevator;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class VendingMachineCLI extends InventoryManager
{
	private final Scanner userInput = new Scanner(System.in);




	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	public VendingMachineCLI() throws FileNotFoundException
	{
	}
	public static void main(String[] args) throws IOException {
	VendingMachineCLI cli = new VendingMachineCLI();
//	cli.run();



	InventoryManager test = new InventoryManager();
	System.out.println(test.breakUpCsvFile2());


//		Map<String, String> items = new HashMap<>();
//		items = cli.breakUpCsvFile();
//		for( Map.Entry<String,String> item : items.entrySet() ){
//			System.out.println(item.getKey() + " " + item.getValue());
//		}

	}

	public void run() throws FileNotFoundException
	{
		while(true)
		{
		OutputMessage main = new OutputMessage();
		main.mainmenu();
		String choice = "";
			choice = userInput.nextLine();

			if(choice.equals("1"))
			{
				// print out a menu with the location and name displayed
				Map<String, String> items = new HashMap<>();
				InventoryManager vendingItems =new InventoryManager();
				items = vendingItems.breakUpCsvFile();
				for( Map.Entry<String,String> item: items.entrySet())
				{
					System.out.println(item.getKey() + " " + item.getValue());
				}
				//we want them to move to purchase phase reprints menu without list:
				main.mainPurcahsemenu();
				choice = userInput.nextLine();
			}


			while(true)
				if (choice.equals("2"))
				{
					AccountController newAccount = new AccountController(0.0);
					System.out.println();
					System.out.println("Your balance is: " + AccountController.STARTING_BALANCE);
					main.moneyMenu();
					choice = userInput.nextLine();
					if( choice.equals("1"))
					{
							System.out.println("Please enter how much you wish to deposit (whole number only) ");
							double newbalance = Double.parseDouble(userInput.nextLine());
							newAccount.deposit(newbalance);
							System.out.println(newAccount.getRemainingBalance());
						System.out.println("Do you wish to add more money? Y or N?");
						String choiceTwo = userInput.next();
						if (choiceTwo.equals("Y"))
						{
							System.out.println("Please enter how much you wish to deposit (whole number only) ");
							Scanner newamount = new Scanner(System.in);
							double money = Double.parseDouble(newamount.nextLine());
							newAccount.deposit(money);
							System.out.println(newAccount.getRemainingBalance());

							// need to have variable to hold total price of all items
							// need a variable to hold names of items bought
							main.mainPurcahsemenu();
							choice = userInput.nextLine();
						}

					}
					if (choice.equals("3"))
					{
						System.out.println("Thank you for your purchase, your change will be: "  );
						// tell customer their balance
						//restart the vending machine from main menu
					}
					System.out.println("Thanks! ");

					// display vending machine items

				}
//			if(choice.equals("3")){
//			System.out.println("Screw you I am going home");
//			//restocks all items if sold out
			}
		}
	}



