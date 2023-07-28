package com.techelevator;

import com.sun.source.tree.WhileLoopTree;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class VendingMachineCLI extends InventoryManager  {
	private final Scanner userInput = new Scanner(System.in);


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
		AccountController newAccount = new AccountController(0.0);
		while (true) {
			OutputMessage main = new OutputMessage();
			main.mainmenu();
			String choice = "";
			choice = userInput.nextLine();
			InventoryManager setInventory = new InventoryManager();
			Map<String, VendableItem> inventory = setInventory.inventory();

			if (choice.equals("1"))
			{
				for( Map.Entry<String,VendableItem> item : inventory.entrySet())
				{

					String slot = item.getKey();
					VendableItem itemObject = item.getValue();

					System.out.println(slot + " " + itemObject.getName() + " " + itemObject.getPrice() + " " + itemObject.getQuantity());
				}
				main.mainPurcahsemenu();
				choice = userInput.nextLine();
			}

				if (choice.equals("2")) {

					System.out.println();
					while (true) {
					System.out.println("Your balance is: " + balance);
					main.moneyMenu();
					 choice = userInput.nextLine();
					if (choice.equals("1"))
					{
						System.out.println("Please enter how much you wish to deposit (whole number only) ");
						double newbalance = Double.parseDouble(userInput.nextLine());
						balance += newAccount.deposit(newbalance);
						System.out.println(balance);
						System.out.println("Do you wish to add more money? Y or N?");
						String choiceTwo = userInput.next();
						int count = 1;
						if(choiceTwo.equals("Y")) {
							System.out.println("Please enter how much you wish to deposit (whole number only) ");
							Scanner newamount = new Scanner(System.in);
							double money = Double.parseDouble(newamount.nextLine());
							balance = newAccount.deposit(money);
							System.out.println(newAccount.getRemainingBalance());

						}
					}
						//main.mainPurcahsemenu();
						 //choice = userInput.nextLine();
						if (choice.equals("2"))
						{
							for (Map.Entry<String, VendableItem> item : inventory.entrySet())
							{
								String slot = item.getKey();
								VendableItem itemObject = item.getValue();
								System.out.println(slot + " " + itemObject.getName() + " " + itemObject.getPrice() + " " + itemObject.getQuantity());
							}
							System.out.println("Which item would you like to buy?");
							choice = userInput.nextLine();
								for (Map.Entry<String, VendableItem> item : inventory.entrySet())
								{
									String slot = item.getKey();
									VendableItem itemObject = item.getValue();

								if (choice.equals(slot) && balance >= itemObject.getPrice() && itemObject.getQuantity() > 0)
								{
									System.out.println("Vending " + itemObject.getName());
									// subtract the price from balance
									balance -= itemObject.getPrice();
									int remain = itemObject.getQuantity() - 1;
									itemObject.setQuantity(remain);
									String itemType = itemObject.getItemCategory();
									if(itemType.equals("Gum"))
									{
										System.out.println("Chew Chew Yum!");
										}
									if(itemType.equals("Drink"))
									{
										System.out.println("Glug Glug Yum!");
									}
									if(itemType.equals("Candy"))
									{
										System.out.println("Yummy Yummy So Sweet!");
									}
									if(itemType.equals("Munchy"))
									{
										System.out.println("Crunch Crunch Yum!");
									}
								}
								if(choice.equals(slot) && balance < itemObject.getPrice() ){

									System.out.println("Broke boy add more money");
								}
								if(choice.equals(slot) && itemObject.getQuantity() == 0){
									System.out.println("Sold Out!");
								}
										}
									}			if(choice.equals("3"))
														{
															System.out.println(balance);
															System.out.println("Thank you for your purchase, your change will be: ");
															newAccount.makeChange(balance);

														}
								}
						}

					if (choice.equals("3"))
					{

						System.out.println(balance);
						System.out.println("Thank you for your purchase, your change will be: ");
						newAccount.makeChange(balance);
						System.exit(0);
					}
			}
		}
}






