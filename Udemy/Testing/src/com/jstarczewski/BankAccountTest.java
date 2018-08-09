package com.jstarczewski;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.BeforeClass
    public static void setUpClass() {
        System.out.println("Only once");
    }

    private BankAccount bankAccount;

    @org.junit.Before
    public void setUp() {
        bankAccount = new BankAccount("Jan", "Star", 100);
        System.out.println("new bank account");
    }


    @org.junit.Test
    public void deposite() {
        double balance = bankAccount.deposite(100, true);
        assertEquals(200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        double balance = bankAccount.withdraw(100, true);
        assertEquals(0, balance, 0);
    }

    @org.junit.Test
    public void getBalance_deposite() {
        bankAccount.deposite(100, true);
        assertEquals(200, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        bankAccount.withdraw(100, true);
        assertEquals(0, bankAccount.getBalance(), 0);
    }

    @org.junit.AfterClass
    public static void after() {
        
    }
}