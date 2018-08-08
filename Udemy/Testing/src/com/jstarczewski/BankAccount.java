package com.jstarczewski;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double deposite(double amount, boolean branch) {
        balance+=amount;
        return balance;
    }
    public double withdraw(double amount, boolean branch) {
        balance-=amount;
        return balance;
    }
    public double getBalance() {
        return balance;
    }
}
