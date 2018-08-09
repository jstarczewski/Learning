package com.jstarczewski;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposite() {
        BankAccount bankAccount = new BankAccount("Jan", "Star", 100);
        double balance = bankAccount.deposite(100, true);
        assertEquals(200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount bankAccount = new BankAccount("Jan", "Star", 100);
        double balance = bankAccount.withdraw(100, true);
        assertEquals(0,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposite() {
        BankAccount bankAccount = new BankAccount("Jan", "Star", 100);
        bankAccount.deposite(100, true);
        assertEquals(200, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("Jan", "Star", 100);
        bankAccount.withdraw(100, true);
        assertEquals(0, bankAccount.getBalance(), 0);
    }
}