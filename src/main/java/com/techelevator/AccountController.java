package com.techelevator;

import java.math.BigDecimal;

public class AccountController
{
    private double remainingBalance;
    public static final double STARTING_BALANCE = 0.00;

    //Constructor
    public AccountController(double remainingBalance) {
        this.remainingBalance = STARTING_BALANCE;
    }
    //End Constructor

    //Getter
    public double getRemainingBalance() {
        return remainingBalance;
    }
    //End Getter

    //Methods
    public double deposit (double amountToDeposit)
    {
        remainingBalance += amountToDeposit;
        return remainingBalance;
    }
    public double withdraw (double price)
    {
        remainingBalance -= price;
        return remainingBalance;
    }
    //End Methods

}
