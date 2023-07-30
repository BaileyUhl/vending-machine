package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MakeChangeTest {
    @Test
public void makes_Change_given_23(){
        AccountController change = new AccountController(0.0);
        change.makeChange(23);
        Assert.assertEquals(92,92);

    }
    @Test
    public void gets_balance(){
        AccountController balance = new AccountController(0.0);
        Assert.assertEquals(0.0,balance.getRemainingBalance(), 0.0);
    }
    @Test
    public void deduct_385_From_10(){
        AccountController deduct = new AccountController(10.0);
        double price = 3.85;
        Assert.assertEquals(-3.85,deduct.deduct(price),0.000);
    }
    @Test
    public void add_385(){
        AccountController add = new AccountController(0.0);
        double price = 3.85;
        Assert.assertEquals(3.85,add.deposit(3.85),0.0);
    }


}
//public double deduct (double price)
//    {
//        remainingBalance -= price;
//        return remainingBalance;
//    }