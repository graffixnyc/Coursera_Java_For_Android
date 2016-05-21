package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */

    final OutputInterface mOut;

    /**
     * Name of the account holder.
     */
    private String name;

    /**
     * Number of the account.
     */
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }



    /**
     * Current balance in the account.
     */

    private double balance;

    /**
     * Constructor initializes the field
     */
    public Account(OutputInterface out) {

        mOut = out;
    }
    public Account(String newName, int newNumber,OutputInterface out){
        this(out);
        name=newName;
        number=newNumber;
    }
    public Account(String newName, int newNumber,double initalBalance,OutputInterface out){
        this(newName,newNumber,out);
        balance=initalBalance;
    }

    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {

        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public void withdrawal(double amount) {
        if (balance > amount)
            balance -= amount;
        else 
            mOut.println("Insufficient Funds");
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }
}
