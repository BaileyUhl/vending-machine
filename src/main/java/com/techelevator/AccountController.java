package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AccountController
{
    private double remainingBalance;
    public static final double STARTING_BALANCE = 0.00;

    //Constructor
    public AccountController(double remainingBalance)
    {
        this.remainingBalance= 0.0;
    }
    //End Constructor

    //Getter
    public double getRemainingBalance()
    {
        return remainingBalance;
    }
    //End Getter

    public void setRemainingBalance(double remainingBalance)
    {
        this.remainingBalance = remainingBalance;
    }

    //Methods
    public double deposit (double amountToDeposit)
    {
        remainingBalance += amountToDeposit;
        return remainingBalance;
    }
    public double deduct (double price)
    {
        remainingBalance -= price;
        return remainingBalance;
    }

    //Dispensing money/ your change
    public void  makeChange (double balance)
    {
       int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        quarters = (int) (balance / .25);
        balance -= quarters * .25;
        dimes = (int)(balance / .1);
        balance -= dimes * .1;
        nickels = (int)(balance / .05);
        balance -= nickels * .05;

        System.out.println("Your change will be " + quarters + " Quarters " + dimes + " Dimes " + nickels + "  Nickels ");
       // remainingBalance = balance;
    }
    //End dispensing money/ your change
}

