package com.techelevator;

public class OutputMessage
{


    public void allDone()
    {
        System.out.println("Thanks for shopping!");
    }
    public void giveUsMoney()
    {
        System.out.println("Please deposit money");
    }
    public void insufficientFunds()
    {
        System.out.println("Sorry, you have insufficient funds.");
    }
    public void vendingItem()
    {
        System.out.println("Vending your item now");

    }
    public void takeYourChange()
    {
        System.out.println("Please take you change");
    }
    public void soldOut()
    {
        System.out.println("Sorry, the item you inputted is sold out");
    }
    public void mainmenu(){
        System.out.println("Welcome to the best vending machine in town");
        System.out.println("Choose from the following options" + "\n" + "(1) Display Vending Machine Items "
                + "\n" + "(2) Purchase" + "\n" + "(3) Exit");
    }
    public void mainPurcahsemenu(){

        System.out.println("Choose from the following options"
                + "\n" + "(2) Purchase" + "\n" + "(3) Exit");
    }
    public void moneyMenu(){
        System.out.println("Choose from the following options" + "\n" + "(1) Feed Money "
                + "\n" + "(2) Select Product" + "\n" + "(3) Finish Transaction");
    }
}
